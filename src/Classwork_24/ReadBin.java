package Classwork_24;

import java.io.*;

public class ReadBin {
    public static void main(String[] args) {
        String fileName = "src/files/qwer.bin";
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            String text = dis.readUTF();
            double value = dis.readDouble();
            int i = dis.readInt();
            System.out.printf("%s %f %d%n",text,value,i);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

