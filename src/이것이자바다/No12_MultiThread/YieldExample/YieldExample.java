package 이것이자바다.No12_MultiThread.YieldExample;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        threadA.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        threadA.work = true;

        try {
            System.out.println(Thread.currentThread());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread());
        } catch (InterruptedException e) {

        }
        // threadA.stop()을 호출하는 것보다 다음과 같이 제어하는 것이 더 안정적이며 좋은 방식이다.
        threadA.stop = true;
        threadB.stop = true;
    }
}
