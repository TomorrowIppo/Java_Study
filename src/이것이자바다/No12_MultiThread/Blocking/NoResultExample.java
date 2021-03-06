package 이것이자바다.No12_MultiThread.Blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
    public static void main(String[] args) {
        // 현재 실행시키는 PC의 CPU의 코어 수만큼 스레드를 생성한 뒤 스레드풀에 넣는다.
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("[작업 처리 요청]");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i=1; i<=10; i++) {
                    sum += i;
                }
                System.out.println("[처리 결과] " + sum);
            }
        };
        // 리턴값이 없는 작업이다.
        // Future는 지연 완료 객체이다.
        Future future = executorService.submit(runnable);
        try {
            future.get();
            System.out.println("[작업 완료]");
        } catch (Exception e) {
            System.out.println("실행 예외 발생: " + e.getMessage());
        }

        // 작업 큐에 있는 모든 작업들을 완료 후 종료한다.
        executorService.shutdown();
    }
}
