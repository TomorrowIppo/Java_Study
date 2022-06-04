package 이것이자바다.No12_MultiThread.StopExample;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            // 여기서 Thread.sleep(1000);의 진정한 의미는
            // 메인 스레드를 대기 예열에서 1초간 열외 시켜 바로 아래 구문인 printThread1.setStop(true);의 실행을 지연시킨다.
            // 지금 이 프로그램의 멀티 스레드는 메인 스레드와 PrintThread1으로 구성돼 있으니 Thread.sleep(1000); 동안엔
            // PrintThread1이 싱글 스레드마냥 혼자 독차지하다 1초 뒤 printThread1.setStop(true);에 의해
            // Stop Flag 방식으로 스레드가 종료된다.
            // 참고로 Thread.sleep(1000);이 호출된 위치가 main() 함수 내이기 때문에 이때 가리키는 스레드는 메인 스레드이다.
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        printThread1.setStop(true);
    }
}
