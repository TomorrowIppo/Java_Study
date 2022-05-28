package 이것이자바다.No11_BasicAPIClass.ToStringExample1;

import java.util.Date;

public class ToStringExample1 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
