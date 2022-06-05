package 이것이자바다.No12_MultiThread.Execute_Submit;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteSubminExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0; i<10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // Executors.newFixedThreadPool()를 통해 만들어진 객체는 ThreadPoolExecutor를 바탕으로 만들어진 객체이기 때문에
                    // 캐스팅을 통해 사용할 수 있다.
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수: " + poolSize +"] 작업 스레드 이름: " + threadName);
                    int value = Integer.parseInt("삼");
                }
            };

            executorService.execute(runnable);
            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}
