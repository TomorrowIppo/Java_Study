package 이것이자바다.No12_MultiThread.PriorityExample;

public class CalcThread extends Thread {
    public CalcThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for(long i=0; i<2000000000; i++) {
        }
        System.out.println(getName());
    }
}
