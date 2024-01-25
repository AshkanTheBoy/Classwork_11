package Classwork_15;

import java.util.Random;

/*
Write a program in Java that generates
a random string with one uppercase letter,
lowercase letters, one or more digits, and one special sign
 */
public class Task_01 {
    private static final String UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_SIGN = "!@#$%^&*()";

    static Random random = new Random();

    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) {
        addUpperChar();
        addLowerChars();
        addNumbers();
        addSpecialChar();
        shuffle(result);
        System.out.println(result);


        //System.out.println(UPPER_CASE_CHARS.charAt(index));

        //System.out.println(result);
    }

    static void addUpperChar(){
        int index = random.nextInt(UPPER_CASE_CHARS.length());
        char randomChar = UPPER_CASE_CHARS.charAt(index);
        result.append(randomChar);
    }

    static void addLowerChars(){
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(LOWER_CASE_CHARS.length());
            char randomChar = LOWER_CASE_CHARS.charAt(index);
            result.append(randomChar);
        }
    }

    static void addNumbers(){
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(DIGITS.length());
            char randomChar = DIGITS.charAt(index);
            result.append(randomChar);
        }
    }

    static void addSpecialChar(){
        int index = random.nextInt(SPECIAL_SIGN.length());
        char randomChar = SPECIAL_SIGN.charAt(index);
        result.append(randomChar);
    }

    static void shuffle(StringBuilder sb){
        for (int i = 0; i < result.length(); i++) {
            swap(sb, random.nextInt(sb.length()), random.nextInt(sb.length()));
        }
    }

    static void swap (StringBuilder sb, int i, int j){
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j,c);
    }
}
