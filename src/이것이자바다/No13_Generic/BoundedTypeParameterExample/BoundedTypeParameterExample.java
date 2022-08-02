package 이것이자바다.No13_Generic.BoundedTypeParameterExample;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        //String str = Util.compare("a", "b"); (x)
        //String은 Number 타입이 아님

        int result1 = Util.compare(10, 20); //10, 20은 int -> Integer로 자동 Boxing
        System.out.println(result1);

        int result2 = Util.compare(4.5, 3); //4.5는 double -> Double로 자동 Boxing
        System.out.println(result2);
    }
}
