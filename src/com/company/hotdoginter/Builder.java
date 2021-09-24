package com.company.hotdoginter;


public interface Builder {

    void withMayone(boolean put);

    void withKetchup(boolean put);

    void withOnion(boolean put);

    void withCucmber(boolean put);

    HotDog createHotDog();

}
