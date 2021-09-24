package com.company.hotdoginter;

import java.io.Serializable;

public interface HotDog extends Serializable {

    void showComposition();

    String getName();

    double getPrice();

    HotDog createHotDog();
}
