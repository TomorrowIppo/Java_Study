package 이것이자바다.No13_Generic.WildCardType;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // Object 객체의 toString()을 재정의
    @Override
    public String toString() {
        return name;
    }
}
