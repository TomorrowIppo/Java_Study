package 이것이자바다.No10_ExceptionHandling.Example07;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {}
    public WrongPasswordException(String msg) {
        //선 부모 후 자식 생성이기 때문에 만약 super(msg)가 아니라
        //System.out.println(msg)를 호출할 시, 출력 결과는
        //msg
        //null
        //순으로 나오게 된다.
        //부모 객체 생성 -> 자식 객체 생성 -> 자식 생성자 호출 -> 부모 생성자 호출
       super(msg);
    }
}
