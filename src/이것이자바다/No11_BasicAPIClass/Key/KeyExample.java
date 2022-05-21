package 이것이자바다.No11_BasicAPIClass.Key;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 "new Key(1)" 로 "홍길동"을 저장함
        hashMap.put(new Key(1), "홍길동");

        //식별키 "new Key(1)" 로 "홍길동"을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);

        //원래대로면 11번째 줄의 new Key(1)과 14번째 줄의 new Key(1)의 메모리 번지는 서로 다르기 때문에
        //서로의 해시코드는 다르다. 그럼에도 불구하고 HashMap에서 new Key(1)으로 "홍길동"을 리턴받고 싶을 경우
        //Key 클래스 (Object 자동 상속)에서 hashCode() 함수를 재정의하여 생성자 호출하면서 받아온 값을 저장한
        //number의 값을 리턴하도록 하면 원하는 결과를 얻을 수 있다.
    }
}
