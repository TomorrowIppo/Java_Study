package 이것이자바다.No12_MultiThread.wait_notifyExample1;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }

    public synchronized void methodC() {
        System.out.println("ThreadC의 methodC() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
}
