package com.company.hotdogsreciept;

import com.company.hotdoginter.HotDog;
import com.company.hotdoginter.HotDogs;
import com.company.priceList;

public class MexicanHotDog extends HotDogs {
    private static int countMexHD = 0;
    private int currentHD;
    private int price = priceList.getPriceMex();
    private boolean jalapena;
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    {
        countMexHD++;
        currentHD = countMexHD;
    }

    public MexicanHotDog(boolean jalapena) {
        this.jalapena = jalapena;
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
    public MexicanHotDog createHotDog() {
        this.compositionToConsole(this);
        this.compositionToFile(this, currentHD);
        return this;
    }

    @Override
    public void showComposition() {
        System.out.println(this);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Mexican hotdog";
    }

    @Override
    public String toString() {
        return "MexicanHotDog{" +
                "currentHD=" + currentHD +
                ", price=" + price +
                ", jalapena=" + jalapena +
                ", mayone=" + mayone +
                ", ketchup=" + ketchup +
                ", onion=" + onion +
                ", cucumber=" + cucumber +
                '}';
    }
}
