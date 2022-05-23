package 이것이자바다.No11_BasicAPIClass.Member1;

public class MemberExample1 {
    public static void main(String[] args) {
        Member1 obj1 = new Member1("blue");
        Member1 obj2 = new Member1("blue");
        Member1 obj3 = new Member1("red");

        if(obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if(obj1.equals(obj3)) {
            System.out.println("obj1과 obj3는 동등합니다.");
        } else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
    }
}
