package com.company.hotdoginter;

import java.io.*;

public abstract class HotDogs implements HotDog {
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    public HotDogs(boolean mayone, boolean ketchup, boolean onion, boolean cucumber) {
        this.mayone = mayone;
        this.ketchup = ketchup;
        this.onion = onion;
        this.cucumber = cucumber;
    }

    private void compositionToConsole(String composition) {
        System.out.println(composition);
    }

    private void compositionToFile(HotDog composition, int numberObj) {
        File file = new File("composition" + composition.getName() + numberObj + ".txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            if (!file.exists())
                file.createNewFile();
            oos.writeObject(composition);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isMayone() {
        return mayone;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isCucumber() {
        return cucumber;
    }
}
