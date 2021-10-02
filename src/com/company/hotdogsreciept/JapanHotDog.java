package com.company.hotdogsreciept;

import com.company.hotdoginter.BuilderHotDog;
import com.company.hotdoginter.HotDog;
import com.company.hotdoginter.HotDogsImpl;
import com.company.paymentAndAction.PriceList;

public class JapanHotDog extends HotDogsImpl {

    private static int countJapHD = 0;
    private int currentHD;
    private double price = PriceList.getPriceJap();
    private boolean wasabi;
    private boolean mayone;
    private boolean ketchup;
    private boolean onion;
    private boolean cucumber;

    public JapanHotDog() {
    }

    private JapanHotDog(Builder builder) {
        wasabi = builder.uniqueFilling;
        mayone = builder.mayone;
        ketchup = builder.ketchup;
        onion = builder.onion;
        cucumber = builder.cucumber;
    }

    {
        countJapHD++;
        currentHD = countJapHD;
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
            return new JapanHotDog(this);
        }
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
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Japan hotdog";
    }
}
