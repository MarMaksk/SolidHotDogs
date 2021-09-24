package com.company.hotdoginter;

import com.company.hotdogsreciept.RussianHotDog;

public interface Builder {

    void withMayone(boolean put);

    void withKetchup(boolean put);

    void withOnion(boolean put);

    void withCucmber(boolean put);

    RussianHotDog getHotDog();

}
