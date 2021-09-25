package com.company;

import com.company.hotdoginter.HotDog;
import com.company.hotdogsreciept.RussianHotDog;
import com.company.paymentAndAction.PaymentCash;

public class Main {

    public static void main(String[] args) {
        HotDog hd = new RussianHotDog.Builder(true).withCucumber().build();


        // System.out.println(hd.createHotDog());
        hd.showComposition();

        //HotDogShop hds = new HotDogShop(new RussianHotDog(true), new PaymentCash());
        HotDogShop hds = new HotDogShop(new PaymentCash());
        hds.addHotDog(hd);
        System.out.println(hds.pay());
        hds.getPrice(2);

    }
}
