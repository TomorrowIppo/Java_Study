package 이것이자바다.No12_MultiThread.StateExample;

public class TargetThread extends Thread {
    @Override
    public void run() {
        for(long i=0; i<100000000; i++) {

        }
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }

        for(long i=0; i<100000000; i++) {

        }
    }
}
