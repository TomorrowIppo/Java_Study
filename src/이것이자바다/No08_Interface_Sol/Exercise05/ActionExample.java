package 이것이자바다.No08_Interface_Sol.Exercise05;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };
        action.work();
    }
}
