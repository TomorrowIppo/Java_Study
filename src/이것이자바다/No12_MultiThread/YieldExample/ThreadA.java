package 이것이자바다.No12_MultiThread.YieldExample;

public class ThreadA extends Thread {
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        // work가 false일 땐 work가 true가 될 때까지 무의미한 반복만 하니, 이땐 스레드를 양보하는 것이 효율적이다.
        while(!stop) {
            if(work) {
                System.out.println(Thread.currentThread());
                //System.out.println("ThreadA 작업 내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
