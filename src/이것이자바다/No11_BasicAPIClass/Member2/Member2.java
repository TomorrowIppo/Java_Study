package 이것이자바다.No11_BasicAPIClass.Member2;

public class Member2 implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member2(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public Member2 getMember() {
        Member2 cloned = null;

        try {
            cloned = (Member2) clone();
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}
