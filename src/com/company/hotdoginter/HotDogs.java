package com.company.hotdoginter;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;

public abstract class HotDogs implements HotDog {

    public void compositionToConsole(HotDog composition) {
        System.out.println(composition);
    }

    public void compositionToFile(HotDog composition, int numberObj) {
        //todo сериализация в json
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
