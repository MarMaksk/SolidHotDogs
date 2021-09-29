package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

import java.util.List;

public interface Payment {
    double pay(List<HotDog> hotDog);

    void showIncome();

    void showCountSaledHotdog();
}
