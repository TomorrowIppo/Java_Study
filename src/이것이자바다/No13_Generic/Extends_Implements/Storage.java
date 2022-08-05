package 이것이자바다.No13_Generic.Extends_Implements;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
