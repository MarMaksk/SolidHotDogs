package com.company.paymentAndAction;

import com.company.hotdoginter.HotDog;

import java.util.List;

public interface Action {
    double checkAction(List<HotDog> hotDog);
}
