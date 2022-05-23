package 이것이자바다.No11_BasicAPIClass.Member1;

public class Member1 {
    public String id;

    public Member1(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member1) {
            Member1 member = (Member1) obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }
}
