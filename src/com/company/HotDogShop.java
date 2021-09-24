package com.company;

import com.company.hotdoginter.BuilderHotDog;
import com.company.hotdoginter.HotDog;
import com.company.hotdogsreciept.RussianHotDog;
import com.company.paymentAndAction.PaymentInter;

import java.util.ArrayList;
import java.util.List;

public class HotDogShop {
    private List<HotDog> hotDog = new ArrayList<>();
    private PaymentInter payment;

    public HotDogShop(PaymentInter payment) {
        this.payment = payment;
    }

    public boolean addHotDog(HotDog hotDog) {
        this.hotDog.add(hotDog);
        return true;
    }

    public boolean removeHotDog(int index) {
        this.hotDog.remove(index);
        return true;
    }

    public void showComposition(int position) {
        hotDog.get(position).showComposition();
    }

    public String getName(int position) {
        return hotDog.get(position).getName();
    }

    public double getPrice(int position) {
        return hotDog.get(position).getPrice();
    }

    public double pay() {
        return payment.pay(hotDog);
    }

    public void showIncome() {
        payment.showIncome();
    }

    public void showCountSaledHotdog() {
        payment.showCountSaledHotdog();
    }
}
