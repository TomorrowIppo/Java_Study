package 이것이자바다.No11_BasicAPIClass.Arrays_BinarySearch;

public class Member implements Comparable<Member> {
    String name;
    Member(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Member obj) {
        return name.compareTo(obj.name);
    }
}
