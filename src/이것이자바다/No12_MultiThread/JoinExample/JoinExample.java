package 이것이자바다.No12_MultiThread.JoinExample;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {

        }
        System.out.println("1~100까지의 합: " + sumThread.getSum());
    }
}
