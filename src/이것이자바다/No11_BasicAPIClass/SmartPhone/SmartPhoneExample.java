package 이것이자바다.No11_BasicAPIClass.SmartPhone;

import org.w3c.dom.ls.LSOutput;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        // System.out.println()의 매개값으로 객체를 주면
        // 자동으로 객체의 toString() 메소드를 호출 후 리턴값을 받아 출력하도록 설계돼 있다.
        System.out.println(myPhone);
    }
}
