package com.company;

import com.company.hotdoginter.HotDog;
import com.company.hotdogsreciept.RussianHotDog;

public class Main {

    public static void main(String[] args) {
        HotDog hd = new RussianHotDog(true);
        hd.withMayone(true);
        System.out.println(hd.createHotDog());
        hd.showComposition();
    }
}
