package 이것이자바다.No12_MultiThread.Blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NoResultExample {
    public static void main(String[] args) {
        // 현재 실행시키는 PC의 CPU의 코어 수만큼 스레드를 생성한 뒤 스레드풀에 넣는다.
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }
}
