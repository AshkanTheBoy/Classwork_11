package Classwork_13;

public class String1 {
    public static void main(String[] args) {
        // Посчитать количество повторяющихся символов в строке
        String s = "Посчитать количество повторяющихся символов в строке";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(s.length()-count);

        String word = "124";
        StringBuilder word1 = new StringBuilder(word);
        String s14 = word1.reverse().toString();
        System.out.println(s14);
        int b = Integer.parseInt(word);
    }
}
