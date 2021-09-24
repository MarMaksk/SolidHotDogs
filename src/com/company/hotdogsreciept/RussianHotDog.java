package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDogs;

public class RussianHotDog extends HotDogs {
    private static int countRusHD = 0;
    private int currentHD;
    private int price = 5;
    private boolean saltCucumber;
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    {
        countRusHD++;
        currentHD = countRusHD;
    }

    public RussianHotDog(boolean saltCucumber) {
        this.saltCucumber = saltCucumber;
    }

    @Override
    public void showComposition() {
        System.out.println(this);
    }

    @Override
    public String getName() {
        return "Russian hotdog";
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
    public RussianHotDog createHotDog() {
        this.compositionToConsole(this);
        this.compositionToFile(this, currentHD);
        return this;
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
