package com.company.paymentAndAction.paymentService;

import com.company.hotdoginter.HotDog;
import com.company.paymentAndAction.PaymentImpl;

import java.util.List;

public class PaymentByCart extends PaymentImpl {

    @Override
    public double pay(List<HotDog> hotDog) {
        // there is no dicsount when paing by card
        double sum = hotDog.stream().mapToDouble(HotDog::getPrice).sum();
        super.setIncome(getIncome() + sum);
        super.setSaledHotdog(getSaledHotdog() + hotDog.size());
        return sum;
    }

}
