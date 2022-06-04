package 이것이자바다.No12_MultiThread.wait_notifyExample2;

public class ProduceThread extends Thread {
    private DataBox dataBox;

    public ProduceThread(DataBox dataBox) {
        setName("ProduceThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++) {
            String data = "Data - " + i;
            dataBox.setData(data);
        }
    }
}
