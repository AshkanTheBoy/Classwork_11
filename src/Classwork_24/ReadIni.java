package Classwork_24;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIni {
    public static void main(String[] args) {
        String fileName = "src/files/Init.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini wini = new Wini(file);
            String name = wini.get("options","name");
            int value = Integer.parseInt(wini.get("options","price"));
            String arr = wini.get("options","array");
            System.out.println(name);
            System.out.println(value);
            System.out.println(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
