package 이것이자바다.No06_Class_Sol.Exercise15;

public class MemberService {
    //작성 위치
    String id;
    String password;

    MemberService() {
    }

    public boolean login(String id, String password) {
        this.id = id;
        this.password = password;

        return (id == "hong" && password == "12345") ? true : false;
    }

    public void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
