import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose your bank: Kaspi, Halyk, Qiwi, FreeDom");
        String bank = sc.nextLine();

        service.processPayment(bank);
    }
}