package 이것이자바다.No12_MultiThread.Callback;

import javax.swing.*;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
    private ExecutorService executorService;

    public CallbackExample() {
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("completed() 실행 : " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {
            System.out.println("failed() 실행 : " + exc.toString());
        }
    };

    // doWork 메소드는 패러미터 x, y를 받아 이를 바탕으로 작업을 수행할 작업 객체를 만든 뒤 수행한다.
    public void doWork(String x, String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    //예외가 발생하지 않았을 시 result 값을 넘겨주고 attachment는 Void 형이니 null을 넘겨준다.
                    callback.completed(result, null);
                } catch (NumberFormatException e) {
                    //예외가 발생했을 시 예외 객체 e를 넘겨주고 attachment는 Void 형이니 null을 넘겨준다.
                    callback.failed(e, null);
                }
            }
        };
        executorService.submit(task);
    }

    public void finish() {
        executorService.shutdown();
    }

    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();
        example.doWork("3", "3");
        example.doWork("3", "삼");

    }
}
