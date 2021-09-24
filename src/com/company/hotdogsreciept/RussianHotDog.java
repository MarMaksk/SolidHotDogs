package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDogs;

import java.io.File;
import java.io.Serializable;

public class RussianHotDog extends HotDogs {
    private int countRusHD = 0;
    {
        countRusHD++;
    }

    public RussianHotDog(boolean mayone, boolean ketchup, boolean onion, boolean cucumber) {
        super(mayone, ketchup, onion, cucumber);
    }

    @Override
    public void showComposition() {

    }

    @Override
    public String getName() {
        return null;
    }

}
