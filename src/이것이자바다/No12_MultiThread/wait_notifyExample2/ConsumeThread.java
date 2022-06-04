package 이것이자바다.No12_MultiThread.wait_notifyExample2;

public class ConsumeThread extends Thread {
    private DataBox dataBox;

    public ConsumeThread(DataBox dataBox) {
        setName("ConsumeThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++) {
            String data = dataBox.getData();
        }
    }
}
