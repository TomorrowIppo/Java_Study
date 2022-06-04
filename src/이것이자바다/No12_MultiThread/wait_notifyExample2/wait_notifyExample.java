package 이것이자바다.No12_MultiThread.wait_notifyExample2;

public class wait_notifyExample {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        ProduceThread produceThread = new ProduceThread(dataBox);
        ConsumeThread consumeThread = new ConsumeThread(dataBox);

        produceThread.start();
        consumeThread.start();
    }
}
