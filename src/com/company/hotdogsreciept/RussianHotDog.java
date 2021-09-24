package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDogs;

import java.io.File;

public class RussianHotDog extends HotDogs {

    public RussianHotDog(boolean mayone, boolean ketchup, boolean onion, boolean cucumber, File file) {
        super(mayone, ketchup, onion, cucumber, file);
    }

    @Override
    public void showComposition() {

    }
}
