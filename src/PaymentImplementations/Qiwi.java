package PaymentImplementations;

public class Qiwi {
    private int balance;
    public Qiwi(int balance) {
        this.balance = balance;
    }
    public boolean QiwiPay(int sum) {
        if (sum <= 0) {
            System.out.println("Qiwi: sum of payment should be more than 0");
            return false;
        }
        int total = (int) (sum * 1.05);
        if(total>balance) {
            System.out.println("Qiwi: dont have enough balance.Tried to pay " + sum + " +5% commission = " + total);
            System.out.println("Qiwi: Remaining balance is " + balance);
            return false;
        }
        balance -= total;

        System.out.println("Paid " + sum + " with Qiwi.+5% commission = " + total + ".Remaining balance: " + balance);
        return true;
    }
}
