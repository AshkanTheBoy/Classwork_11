package Classwork_21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Vocabulary {
    public static void main(String[] args) {
        int count = 'z'-'a'+1;
        //System.out.println(count);
        List<String> vocabulary = new LinkedList<>();
        //Заполнить словарь из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Classwork_20/data/Vocab.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocabulary.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vocabulary.size());
        Collections.sort(vocabulary);
//        for (String word:vocabulary){
//            System.out.println(word);
//        }
        ListIterator<String> it = vocabulary.listIterator(0);
        int i = 0;
        while(it.hasNext()&&i<10){
            System.out.print(it.next()+" ");
            i++;
        }
    }
}
