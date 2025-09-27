import PaymentInterface.PaymentInterface;

import java.util.Scanner;

public class PaymentService {
    private final Scanner sc = new Scanner(System.in);
    public void processPayment(String bank) {
        System.out.println("Enter the sum of payment: ");
        int sum = sc.nextInt();

        System.out.println("Enter the balance: ");
        int balance2 = sc.nextInt();

        PaymentInterface choose = PaymentFactory.getPaymentInterface(bank,balance2);
        choose.pay(sum);
    }
}
