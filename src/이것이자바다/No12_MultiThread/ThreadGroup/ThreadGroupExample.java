package 이것이자바다.No12_MultiThread.ThreadGroup;

public class ThreadGroupExample {
    //[System]
    //      ->[main]
    //          ->main
    //          ->[myGroup]
    //              ->workThreadA
    //              ->workThreadB
    //  단, []표시는 스레드 그룹, 없는 것은 스레드를 의미한다.

    //스레드 그룹화를 하면 스레드 그룹 내에 수많은 스레드가 존재하더라도 한 번의 interrupt() 메소드 호출로
    //수많은 스레드를 한 번에 안전히 종료할 수 있기 때문에 사용한다.

    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        // 메인 그룹의 현 상황을 출력해줌
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
        myGroup.interrupt();
    }
}
