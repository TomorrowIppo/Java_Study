package 이것이자바다.No09_NestedClass_NestedInterface_Sol.Example04;

public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }
}
