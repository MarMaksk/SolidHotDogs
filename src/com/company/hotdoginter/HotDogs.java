package com.company.hotdoginter;

import java.io.*;

public abstract class HotDogs implements HotDog {
    private boolean mayone = false;
    private boolean ketchup = false;
    private boolean onion = false;
    private boolean cucumber = false;

    public HotDogs(boolean mayone, boolean ketchup, boolean onion, boolean cucumber, File file) {
        this.mayone = mayone;
        this.ketchup = ketchup;
        this.onion = onion;
        this.cucumber = cucumber;
        this.file = file;
    }

    private File file = new File("compositionHD.txt");

    private void compositionToConsole(String composition) {
        System.out.println(composition);
    }

    private void compositionToFile(String composition) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            file.createNewFile();
            bw.write(composition);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
