package Classwork_24.serialize;

import java.io.*;
import java.util.Arrays;

public class WriteReadPerson {
    public static void main(String[] args) {
        try {
            writePerson();
            readPerson();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void writePerson() throws IOException {
        FileOutputStream file = new FileOutputStream("src/files/person.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);
        Person person = new Person(1, "Alex", "+37533111");
        person.setEmails(Arrays.asList("alex@gmail.com", "alex @rambler.ru"));

        Person person2 = new Person(2, "Alexey", "+37533222");
        person2.setEmails(Arrays.asList("alexey @gmail.com", "alexey @rambler.ru"));

        out.writeObject(person);
        out.writeObject(person2);
        out.close();
        file.close();
        System.out.println("Object has been serialized");
    }

    static void readPerson() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("src/files/person.bin");
        ObjectInputStream in = new ObjectInputStream(file);
        Person person;
        try { //По другому не получится
            while ((person = (Person) in.readObject()) != null)
                System.out.println(person);
        }
        catch (EOFException e){};
        in.close();
        file.close();
    }
}
