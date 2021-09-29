package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

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
