package 이것이자바다.No12_MultiThread.PriorityExample;

public class PriorityExample {
    public static void main(String[] args) {
        // 우선순위를 설정해도 영향이 가지 않은 이유는 현 pc (MacBook Air M1 2020기준)코어의 수가 많아 10개의 객체를 생성해도 병렬처리로 처리하기 때문이다.
        for(int i=1; i<=10; i++) {
            Thread thread = new CalcThread("thread" + i);
            if(i == 10) {
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            thread.start();
        }
    }
}
