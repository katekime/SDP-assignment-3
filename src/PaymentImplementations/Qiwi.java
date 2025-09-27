package PaymentImplementations;

public class Qiwi {
    private int balance;
    public Qiwi(int balance) {
        this.balance = balance;
    }
    public void QiwiPay(int sum) {
        int total = (int) (sum * 1.05);
        System.out.println(sum + " was paid using Qiwi.Transfer was made with a 5% commission");
    }
}
