package 이것이자바다.No11_BasicAPIClass.NewInstance;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("이것이자바다.No11_BasicAPIClass.NewInstance.SendAction");
            //Class clazz = Class.forName("이것이자바다.No11_BasicAPIClass.NewInstance.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
