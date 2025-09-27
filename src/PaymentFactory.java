import Adapters.*;
import PaymentImplementations.*;
import PaymentInterface.PaymentInterface;

import java.util.Scanner;

public class PaymentFactory {
//    Scanner sc = new Scanner(System.in);
//
    public static PaymentInterface getPaymentInterface(String bank,int balance) {
        if(bank.equalsIgnoreCase("Kaspi")){
            return new KaspiAdapter(new Kaspi(balance));
        }
        else if(bank.equalsIgnoreCase("Qiwi")){
            return new QiwiAdapter(new Qiwi(balance));
        } else if (bank.equalsIgnoreCase("FreeDom")) {
            return new FreeDomAdapter(new FreeDom(balance));
        }
        else if(bank.equalsIgnoreCase("Halyk")) {
            return new HalykAdapter(new Halyk(balance));
        }
        else {
            throw new IllegalArgumentException("Bank Not Found");
        }
    }
}
