package Classwork_22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        //System.out.println(vocabulary.size());
        //Collections.sort(vocabulary);
//        for (String word:vocabulary){
//            System.out.println(word);
//        }
        ListIterator<String> it = vocabulary.listIterator(vocabulary.size());
//        int i = 0;
//        while(it.hasPrevious()&&i<10){
//            System.out.print(it.previous()+" ");
//            i++;
//        }
        //Статистика по кол-ву букв в словах
//        int maxLength = 0;
//        for (String word: vocabulary){
//            if (word.length()>maxLength){
//                maxLength=word.length();
//            }
//        }
//        System.out.println(maxLength);
//
//        int[] hist = new int[maxLength];
//        for (String word: vocabulary){
//            hist[word.length()-1]++;
//        }
//        for (int i = 0; i < maxLength; i++) {
//            System.out.printf("Букв: %d, слов: %d%n",i+1,hist[i]);
//        }

        //Палиндромы
//        for (String word: vocabulary){
//            if (word.equals(new StringBuilder(word).reverse().toString())){
//                System.out.println(word);
//            }
//        }

        //Анаграммы
//        Multimap<String, String> anagrams = ArrayListMultimap.create();
//        for (String word: vocabulary){
//            char[] arr = word.toCharArray();
//            Arrays.sort(arr);
//            String key = new String(arr);
//            anagrams.put(key,word);
//        }
//
//        String key, key2 = "";
//        Map.Entry<String,String> entry2 = null;
//        for (Map.Entry<String,String> entry: anagrams.entries()){
//            key=entry.getKey();
//            if (key.equals(key2)){
//                System.out.println(entry2.getValue()+" "+entry.getValue());
//            }
//            key2=key;
//            entry2=entry;
//        }

        //Слова с 3-мя одинаковыми буквами
//        it = vocabulary.listIterator(0);
//        while (it.hasNext()) {
//            String s = it.next();
//            char[] arr = s.toCharArray();
//            Arrays.sort(arr);
//            count = 1;
//            char c = ' ';
//            for (int i = 0; i < arr.length; i++) {
//                char c2 = arr[i];
//                if (c == c2) count++;
//                else count = 1;
//                if (count == 3) { //Проверить с 4-мя буквами
//                    System.out.println(s+" ");
//                    break;
//                }
//                c = c2;
//            }
//        }
//        System.out.println();

        //3 буквы в алф. порядке
        it = vocabulary.listIterator(0);
        while (it.hasNext()) {
            String s = it.next();
            char[] arr = s.toCharArray();
            count = 1;
            char c = ' ';
            for (int i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c2-c==1) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s+" ");
                    break;
                }
                c = c2;
            }
        }
    }
}
