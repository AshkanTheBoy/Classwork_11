package Classwork_15;

import com.maximeroussy.invitrode.WordGenerator;

public class Task_06 {
    public static void main(String[] args) {
        WordGenerator generator = new WordGenerator();
        for (int i=0; i<10; i++)
            System.out.println(generator.newWord(10));
    }
}

