package Classwork_24;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class WriteIni {
    public static void main(String[] args) {
        String fileName = "src/files/Init.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini(file);
            ini.put("options","name","product1");
            ini.put("options","price",100);
            ini.put("options","array", Arrays.toString(new int[]{1,2,3}));
            ini.store();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
