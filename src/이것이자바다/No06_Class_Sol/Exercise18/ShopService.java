package 이것이자바다.No06_Class_Sol.Exercise18;

public class ShopService {
    //작성 위치
    private static ShopService shopService = new ShopService();

    private ShopService() {}
    public static ShopService getInstance() {
        return shopService;
    }
}
