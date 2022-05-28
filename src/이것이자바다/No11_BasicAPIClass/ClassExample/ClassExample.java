package 이것이자바다.No11_BasicAPIClass.ClassExample;

import 이것이자바다.No11_BasicAPIClass.Member3.Car;

public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car("현대");
        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();

        try {
            Class clazz2 = Class.forName("이것이자바다.No11_BasicAPIClass.Member3.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
