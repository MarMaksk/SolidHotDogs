package com.company;

import java.io.*;

public abstract class HotDogs implements HotDog {

    private File file = new File("compositionHD.txt");

    private void compositionToFile(String composition) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            file.createNewFile();
            bw.write(composition);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
