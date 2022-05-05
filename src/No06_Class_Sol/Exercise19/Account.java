package No06_Class_Sol.Exercise19;

public class Account {
    //작성 위치
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    private int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
            this.balance = balance;
    }
}
