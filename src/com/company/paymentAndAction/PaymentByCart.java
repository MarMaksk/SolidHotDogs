package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

import java.util.List;

public class PaymentByCart extends PaymentImpl {

    @Override
    public double pay(List<HotDog> hotDog) {
        // there is no dicsount when paing by card
        double sum = 0;
        for (HotDog hd : hotDog)
            sum += hd.getPrice();
        sum = sum / hotDog.size();
        super.setIncome(getIncome() + sum);
        super.setSaledHotdog(getSaledHotdog() + hotDog.size());
        return sum;
    }

}
