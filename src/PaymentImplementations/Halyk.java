package PaymentImplementations;

import java.util.Scanner;

public class Halyk {
    private int balance;
    public Halyk(int balance) {
        this.balance = balance;
    }

    public boolean HalykPay(int sum) {
        if (sum <= 0) {
            System.out.println("Halyk: sum of payment should be more than 0");
            return false;
        }
        if(sum>balance) {
            System.out.println("Halyk: dont have enough balance.Paid only " + balance + " instead of " + sum);
            balance = 0;
            System.out.println("Remaining balance: " + balance);
            return false;
        }
        balance -= sum;
        System.out.println("Money " + sum + " was transferred by HalykBank.Remaining balance: " + balance);
        return true;
    }
}
