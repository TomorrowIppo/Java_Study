package 이것이자바다.No13_Generic.BoxExample2;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.set("Hello");
        String str = box1.get();

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
    }
}
