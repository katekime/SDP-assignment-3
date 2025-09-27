package PaymentImplementations;

public class Kaspi {
    private int balance;
    public Kaspi(int balance) {
        this.balance = balance;
    }

    public boolean KaspiPay(int sum) {
        if (sum <= 0) {
            System.out.println("Kaspi: sum of payment should be more than 0");
            return false;
        }
        if(sum>balance) {
            System.out.println("Kaspi: dont have enough balance.Paid only " + balance + " instead of " + sum);
            balance = 0;
            System.out.println("Kaspi: Remaining balance is " + balance);
            return false;
        }
        if(sum>100000) {
            System.out.println("Kaspi: limit was exceed");
            return false;
        }
        balance -= sum;
        System.out.println("Paid " + sum + " with Kaspi.Remaining balance: " + balance);
        return true;
    }
}
