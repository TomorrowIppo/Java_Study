package 이것이자바다.No12_MultiThread.wait_notifyExample1;

public class wait_notifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        ThreadC threadC = new ThreadC(sharedObject);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
