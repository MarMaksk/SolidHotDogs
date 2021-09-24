package com.company.hotdoginter;


public interface BuilderHotDog {

    BuilderHotDog withMayone();

    BuilderHotDog withKetchup();

    BuilderHotDog withOnion();

    BuilderHotDog withCucumber();

    HotDog build();
}
