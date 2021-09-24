package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDog;
import com.company.hotdoginter.HotDogs;

public class JapanHotDog extends HotDogs {

    private static int countJapHD = 0;
    private int currentHD;
    private int price = 5;
    private boolean wasabi;
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    public JapanHotDog(boolean wasabi) {
        this.wasabi = wasabi;
    }

    {
        countJapHD++;
        currentHD = countJapHD;
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
    public JapanHotDog createHotDog() {
        this.compositionToConsole(this);
        this.compositionToFile(this, currentHD);
        return this;
    }

    @Override
    public void showComposition() {
        System.out.println(this);
    }

    @Override
    public String getName() {
        return "Japan hotdog";
    }
}
