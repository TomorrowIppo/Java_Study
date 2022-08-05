package 이것이자바다.No13_Generic.BoundedTypeParameterExample;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        // (v1 > v2) ? 1 : -1
        return Double.compare(v1, v2);
    }
}
