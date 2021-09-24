package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDogs;

import java.io.File;
import java.io.Serializable;

public class RussianHotDog extends HotDogs {
    private static int countRusHD = 0;
    private boolean saltCucumber = false;

    {
        countRusHD++;
    }

    public RussianHotDog(boolean mayone, boolean ketchup, boolean onion, boolean cucumber, boolean saltCucumber) {
        super(mayone, ketchup, onion, cucumber);
        this.saltCucumber = saltCucumber;
    }

    @Override
    public void showComposition() {

    }

    @Override
    public String getName() {
        return null;
    }

}
