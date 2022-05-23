package 이것이자바다.No11_BasicAPIClass.Member3;

import 이것이자바다.No06_Class_Sol.Exercise13_14.Member;

import java.util.Arrays;

public class Member3 implements Cloneable {
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member3(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected  Object clone() throws CloneNotSupportedException {
        //먼저 얕은 복사를 해서 name, age를 복제한다
        Member3 cloned = (Member3) super.clone();
        //scores를 깊은 복제한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        //car를 깊은 복제한다.
        cloned.car = new Car(this.car.model);
        //깊은 복제된 Member 객체를 리턴
        return cloned;
    }

    public Member3 getMember() {
        Member3 cloned = null;
        try {
            cloned = (Member3) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
