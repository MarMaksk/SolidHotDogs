package com.company.hotdoginter;

import java.io.*;

public abstract class HotDogs implements HotDog {

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

}
