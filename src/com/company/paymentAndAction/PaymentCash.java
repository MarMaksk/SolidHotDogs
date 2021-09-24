package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

public class PaymentCash extends Payment implements ActionInter {
    @Override
    public double pay(HotDog... hotDog) {
        double discount = checkAction(hotDog);
        double sum = 0;
        for (HotDog hd : hotDog)
            sum += hd.getPrice();
        sum = sum * discount / hotDog.length;
        super.setIncome(getIncome() + sum);
        super.setSaledHotdog(getSaledHotdog() + hotDog.length);
        return sum;
    }


    @Override
    public double checkAction(HotDog... hotDog) {
        switch (hotDog.length) {
            case 3:
                return 0.9;
            case 4:
                return 0.8;
            case 5:
                return 0.7;
            case 6:
                return 0.6;
            case 7:
                return 0.5;
            default:
                break;
        }
        if (hotDog.length > 7)
            return 0.5;
        return 1;
    }
}
