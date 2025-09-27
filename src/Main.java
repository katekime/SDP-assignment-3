import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose your bank");
            String bank = sc.nextLine();

            service.processPayment(bank);
            break;
        }
    }
}