package com.company.hotdogsreciept;

import com.company.hotdoginter.BuilderHotDog;
import com.company.hotdoginter.HotDog;
import com.company.hotdoginter.HotDogs;
import com.company.paymentAndAction.PriceList;

public class MexicanHotDog extends HotDogs {
    private static int countMexHD = 0;
    private int currentHD;
    private int price = PriceList.getPriceMex();
    private boolean jalapena;
    private boolean mayone;
    private boolean ketchup;
    private boolean onion;
    private boolean cucumber;

    {
        countMexHD++;
        currentHD = countMexHD;
    }

    public MexicanHotDog(Builder builder) {
        jalapena = builder.uniqueFilling;
        mayone = builder.mayone;
        ketchup = builder.ketchup;
        onion = builder.onion;
        cucumber = builder.cucumber;
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
            return new MexicanHotDog(this);
        }
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
