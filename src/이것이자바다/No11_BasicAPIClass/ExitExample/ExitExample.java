package 이것이자바다.No11_BasicAPIClass.ExitExample;

public class ExitExample {
    public static void main(String[] args) {
        //보안 관리자 실행
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if(status != 5) {
                    throw new SecurityException();
                }
            }
        });

        for(int i = 0; i < 10; i++) {
            //i값 출력
            System.out.println(i);
            try {
                //JVM 종료 요청
                System.exit(i);
            } catch (SecurityException e) {

            }
        }
    }
}
