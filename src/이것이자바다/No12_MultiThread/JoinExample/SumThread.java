package 이것이자바다.No12_MultiThread.JoinExample;

public class SumThread extends Thread {
    private long sum;
    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
