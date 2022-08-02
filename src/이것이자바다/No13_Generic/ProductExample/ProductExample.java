package 이것이자바다.No13_Generic.ProductExample;

public class ProductExample {
    public static void main(String[] args) {
        //자바7 이전 코드, 물론 이렇게 써도 문제는 없다
        //Product<Tv, String> product1 = new Product<Tv, String>();
        //자바7 이후 코드
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        //Product<Car, String> product2 = new Product<Car, String>();
        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}