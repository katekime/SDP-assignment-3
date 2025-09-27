In this project I implemented a simple payment system where different banks (Kaspi, Halyk, Qiwi, FreeDom) have their own payment rules. The main problem was that every bank had a different method name and logic (for example, KaspiPay, QiwiPay, FreeDomPay). Because of this, it was hard to use them in one common service.
To solve this, I used the Adapter pattern.

Each bank class is left as it is, with its own payment logic.

I created adapters like KaspiAdapter, QiwiAdapter, FreeDomAdapter, HalykAdapter that implement one common interface PaymentInterface.

This makes it possible to call pay() for any bank, no matter how the original class works inside.

Then I added a PaymentFactory class which chooses the right adapter depending on the bank name.
Finally, in the Main and PaymentService classes I used scanner input so the user can choose a bank, enter balance and payment sum, and then see the result.

Example behavior:
Kaspi has a payment limit of 100,000.

Qiwi always adds 5% commission.

FreeDom requires that the sum is a multiple of 100.

Each class prints the result and updates the balance.

Why Adapter?
This really looks like an Adapter because I didn’t change the original bank classes. Instead, I wrapped them in small adapters that make them fit one interface. Thanks to that, my service can work with all banks in the same way.

Conclusion
The system works, it is extendable new banks can be added easily with new adapters, and it demonstrates Adapter + Factory patterns.
