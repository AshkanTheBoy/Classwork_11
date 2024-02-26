package Classwork_24;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinFile {
    public static void main(String[] args) {
        String fileName = "src/files/qwer.bin";
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName,false))) {
            dos.writeUTF("qwer");
            dos.writeDouble(3.14);
            dos.writeInt(54);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
