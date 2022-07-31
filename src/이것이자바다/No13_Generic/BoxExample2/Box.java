package 이것이자바다.No13_Generic.BoxExample2;

public class Box<T> {
    private T t;
    public T get() { return t; }
    public void set(T t) { this.t = t; }
}
