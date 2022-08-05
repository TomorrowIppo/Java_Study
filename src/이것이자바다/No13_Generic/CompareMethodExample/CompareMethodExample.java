package 이것이자바다.No13_Generic.CompareMethodExample;

public class CompareMethodExample {
    public static void main(String[] args) {
        // 타입 패러미터를 생략해도 들어온 매개변수를 통해 타입 패러미터를 유추하기 때문에 굳이 안 써도 정상적으로 작동한다.
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
        boolean result1 = Util.<Integer, String> compare(p1, p2);
        if(result1) {
            System.out.println("논리적으로 동등한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않는 객체입니다.");
        }

        // 타입 패러미터를 생략해도 들어온 매개변수를 통해 타입 패러미터를 유추하기 때문에 굳이 안 써도 정상적으로 작동한다.
        Pair<String, String> p3 = new Pair<>("User1", "player");
        Pair<String, String> p4 = new Pair<String, String>("User2", "player");
        boolean result2 = Util.compare(p3, p4);
        if(result2) {
            System.out.println("논리적으로 동등한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않는 객체입니다.");
        }
    }
}
