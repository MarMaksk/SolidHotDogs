package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

import java.util.List;

public class PaymentCash extends PaymentImpl implements Action {
    @Override
    public double pay(List<HotDog> hotDog) {
        double discount = checkAction(hotDog);
        double sum = hotDog.stream().mapToDouble(HotDog::getPrice).sum() * discount;
        super.setIncome(getIncome() + sum);
        super.setSaledHotdog(getSaledHotdog() + hotDog.size());
        return sum;
    }


    @Override
    public double checkAction(List<HotDog> hotDog) {
        switch (hotDog.size()) {
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
        if (hotDog.size() > 7)
            return 0.5;
        return 1;
    }
}
