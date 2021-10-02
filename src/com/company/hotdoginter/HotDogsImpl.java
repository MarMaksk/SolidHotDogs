package com.company.hotdoginter;

import java.io.*;

public abstract class HotDogsImpl implements HotDog {

    public void compositionToConsole(HotDog composition) {
        System.out.println(composition);
    }

    public void compositionToFile(HotDog composition, int numberObj) {
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
