package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDogs;

public class RussianHotDog extends HotDogs {
    private static int countRusHD = 0;
    private int price = 5;
    private boolean saltCucumber = true;
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    {
        countRusHD++;
    }

    @Override
    public void showComposition() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void withMayone(boolean put) {
        this.mayone = put;
    }

    @Override
    public void withKetchup(boolean put) {
        this.ketchup = put;
    }

    @Override
    public void withOnion(boolean put) {
        this.onion = put;
    }

    @Override
    public void withCucmber(boolean put) {
        this.cucumber = put;
    }

    @Override
    public RussianHotDog getHotDog() {
        return new RussianHotDog();
    }

    @Override
    public String toString() {
        return "RussianHotDog{" +
                "price=" + price +
                ", saltCucumber=" + saltCucumber +
                ", mayone=" + mayone +
                ", ketchup=" + ketchup +
                ", onion=" + onion +
                ", cucumber=" + cucumber +
                '}';
    }
}
