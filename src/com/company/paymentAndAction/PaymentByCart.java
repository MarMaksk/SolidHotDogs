package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

public class PaymentByCart extends Payment {

    @Override
    public double pay(HotDog... hotDog) {
        // При оплате картой скидка не предоставляется
        double sum = 0;
        for (HotDog hd : hotDog)
            sum += hd.getPrice();
        sum = sum / hotDog.length;
        super.setIncome(getIncome() + sum);
        super.setSaledHotdog(getSaledHotdog() + hotDog.length);
        return sum;
    }

}
