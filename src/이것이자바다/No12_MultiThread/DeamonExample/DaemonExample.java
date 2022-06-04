package 이것이자바다.No12_MultiThread.DeamonExample;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println("메인 스레드 종료");
    }
}
