package Adapters;

import PaymentImplementations.Qiwi;
import PaymentInterface.PaymentInterface;

public class QiwiAdapter implements PaymentInterface {
    private final Qiwi qiwi;

    public QiwiAdapter(Qiwi qiwi) {
        this.qiwi = qiwi;
    }

    @Override
    public void pay(int sum) {
        qiwi.QiwiPay(sum);
    }
}
