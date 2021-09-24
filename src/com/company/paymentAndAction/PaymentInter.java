package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

import java.util.List;

public interface PaymentInter {
    double pay(List<HotDog> hotDog);

    void showIncome();

    void showCountSaledHotdog();
}
