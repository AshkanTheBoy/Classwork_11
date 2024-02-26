package Classwork_24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "src/files/text.txt";
        StringBuilder sb;
        try(FileReader fr = new FileReader(fileName)){
            System.out.println("Encoding: "+fr.getEncoding());
            sb = new StringBuilder();
            int i;
            while ((i=fr.read())!=-1){
                sb.append((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}
