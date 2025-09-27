package Adapters;
import PaymentImplementations.Halyk;
import PaymentInterface.PaymentInterface;

public class HalykAdapter implements PaymentInterface {
    private final Halyk halyk;

    public HalykAdapter(Halyk halyk) {
        this.halyk = halyk;
    }

    @Override
    public void pay(int sum) {
        halyk.HalykPay(sum);
    }
}
