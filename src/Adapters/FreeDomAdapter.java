package Adapters;

import PaymentImplementations.FreeDom;
import PaymentInterface.PaymentInterface;

public class FreeDomAdapter implements PaymentInterface {
    private final FreeDom freedom;

    public FreeDomAdapter(FreeDom freedom) {
        this.freedom = freedom;
    }
    @Override
    public void pay(int sum) {
        freedom.FreeDomPay(sum);
    }
}
