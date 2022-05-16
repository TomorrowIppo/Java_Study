package 이것이자바다.No09_NestedClass_NestedInterface.Example05;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.run();
        anonymous.method1();
        anonymous.method2(
                new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("트럭이 달립니다.");
                    }
                }
        );
    }
}
