package com.company.hotdogsreciept;

import com.company.hotdoginter.BuilderHotDog;
import com.company.hotdoginter.HotDog;
import com.company.hotdoginter.HotDogsImpl;
import com.company.paymentAndAction.PriceList;

public class RussianHotDog extends HotDogsImpl {
    private static int countRusHD = 0;
    private int currentHD;
    private double price = PriceList.getPriceRus();
    private boolean saltCucumber;
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    {
        countRusHD++;
        currentHD = countRusHD;
    }

    public RussianHotDog() {
    }

    public RussianHotDog(Builder builder) {
        saltCucumber = builder.uniqueFilling;
        mayone = builder.mayone;
        ketchup = builder.ketchup;
        onion = builder.onion;
        cucumber = builder.cucumber;
    }

    @Override
    public void showComposition() {
        System.out.println(this);
    }

    @Override
    public String getName() {
        return "Russian hotdog";
    }

    public static class Builder implements BuilderHotDog {
        private boolean uniqueFilling;
        private boolean mayone = false;
        private boolean ketchup = false;
        private boolean onion = false;
        private boolean cucumber = false;

        public Builder(boolean uniqueFilling) {
            this.uniqueFilling = uniqueFilling;
        }

        @Override
        public BuilderHotDog withMayone() {
            mayone = true;
            return this;
        }

        @Override
        public BuilderHotDog withKetchup() {
            ketchup = true;
            return this;
        }

        @Override
        public BuilderHotDog withOnion() {
            onion = true;
            return this;
        }

        @Override
        public BuilderHotDog withCucumber() {
            cucumber = true;
            return this;
        }

        @Override
        public HotDog build() {
            return new RussianHotDog(this);
        }


    }

    @Override
    public RussianHotDog createHotDog() {
        this.compositionToConsole(this);
        this.compositionToFile(this, currentHD);
        return this;
    }

    @Override
    public double getPrice() {
        return price;
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
