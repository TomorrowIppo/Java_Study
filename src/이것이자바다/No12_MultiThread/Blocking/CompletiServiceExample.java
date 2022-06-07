package 이것이자바다.No12_MultiThread.Blocking;

import java.util.concurrent.*;

public class CompletiServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService =
                new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[작업 처리 요청]");
        for(int i=1; i<=3; i++) {
             completionService.submit(new Callable<Integer>() {
                 @Override
                 public Integer call() throws Exception {
                     int sum = 0;
                     for(int i=1; i<=10; i++) {
                         sum += i;
                     }

                     return sum;
                 }
             });
        }
        System.out.println("[처리가 완료된 작업 확인]");
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        // 여기서 get() 메소드는 블로킹 메소드지만, take() 메소드가 작업이 완료된 작업을 가져오기 때문에
                        // 실질적으로 블로킹될 일은 없다.
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("[처리 결과]  : " + value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });

        // 작업 큐에 Callable<Integer> 작업을 넣었다고 해서 작업이 끝난 것이 아니다.
        // 실행이 너무 빠르게 진행될 경우 Callable<Integer>의 작업이 끝나지 않은 채 지나가버릴 수도 있기 때문에
        // 3초동안 기다리도록 설정하고 3초 후 에 스레드 풀을 강제적으로 종료시킨다.
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

        executorService.shutdownNow();
    }
}
