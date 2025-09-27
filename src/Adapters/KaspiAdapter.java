package Adapters;
import PaymentImplementations.Kaspi;
import PaymentInterface.PaymentInterface;

public class KaspiAdapter implements PaymentInterface {
    private final Kaspi kaspi;

    public KaspiAdapter(Kaspi kaspi) {
        this.kaspi = kaspi;
    }

    @Override
    public void pay(int sum) {
        kaspi.KaspiPay(sum);
    }
}
