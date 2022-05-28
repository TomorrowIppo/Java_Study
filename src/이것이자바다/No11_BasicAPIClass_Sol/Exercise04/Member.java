package 이것이자바다.No11_BasicAPIClass_Sol.Exercise04;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //여기서 코드를 작성하세요.

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
