package com.company;

import com.company.hotdoginter.HotDog;
import com.company.paymentAndAction.Payment;

import java.util.ArrayList;
import java.util.List;

public class HotDogShop {
    private List<HotDog> hotDog = new ArrayList<>();
    private Payment payment;

    public HotDogShop(Payment payment) {
        this.payment = payment;
    }

    public boolean addHotDog(HotDog hotDog) {
        this.hotDog.add(hotDog);
        return true;
    }

    public boolean removeHotDog(int index) {
        checkIndex(index);
        this.hotDog.remove(index);
        return true;
    }

    public void showComposition(int index) {
        checkIndex(index);
        hotDog.get(index).showComposition();
    }

    public String getName(int index) {
        checkIndex(index);
        return hotDog.get(index).getName();
    }

    public double getPrice(int index) {
        checkIndex(index);
        return hotDog.get(index).getPrice();
    }

    private void checkIndex(int position) {
        if (position > (hotDog.size() - 1))
            throw new IndexOutOfBoundsException("В заказе хотдогов: " + hotDog.size());
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
