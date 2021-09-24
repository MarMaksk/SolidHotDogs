package com.company;

import com.company.hotdoginter.HotDog;

public class payment implements paymentInter {
    @Override
    public double pay(HotDog... hotDog) {
        double sum = 0;
        for (HotDog hd : hotDog)
            sum += hd.getPrice();
        return sum / hotDog.length;
    }


}
