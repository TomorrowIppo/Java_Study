package 이것이자바다.No12_MultiThread.wait_notifyExample2;

public class DataBox {
    private String data;

    public synchronized String getData() {
        if(this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        String returnValue = data;
        System.out.println("ConsumeThread가 읽은 데이터: " + returnValue);
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.data = data;
        System.out.println("ProduceThread가 저장한 데이터: " + data);
        notify();
    }
}
