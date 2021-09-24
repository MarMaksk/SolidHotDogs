package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

import java.util.List;

public class PaymentByCart extends Payment {

    @Override
    public double pay(List<HotDog> hotDog) {
        // При оплате картой скидка не предоставляется
        double sum = 0;
        for (HotDog hd : hotDog)
            sum += hd.getPrice();
        sum = sum / hotDog.size();
        super.setIncome(getIncome() + sum);
        super.setSaledHotdog(getSaledHotdog() + hotDog.size());
        return sum;
    }

}
