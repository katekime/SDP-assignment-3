package PaymentImplementations;

public class FreeDom {
    private int balance;
    public  FreeDom(int balance) {
        this.balance = balance;
    }
    public boolean FreeDomPay(int sum) {
        if (sum % 100 != 0) {
            System.out.println("FreeDom: sum should be a multiple of 100");
            return false;
        }
        if (sum > balance) {
            System.out.println("FreeDom: dont have enough balance.Balance is: " + balance);
            return false;
        }
        balance -= sum;
        System.out.println("FreeDom: Paid " + sum + ". Remaining balance: " + balance);
        return true;
    }
}
