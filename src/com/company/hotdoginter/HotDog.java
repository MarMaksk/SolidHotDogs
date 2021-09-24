package com.company.hotdoginter;

import java.io.Serializable;

public interface HotDog extends Serializable, Builder {
    void showComposition();

    String getName();

}
