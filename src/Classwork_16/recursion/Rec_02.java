package Classwork_16.recursion;

public class Rec_02 {
    static String string = "1234";
    static int n = string.length();
    public static void main(String[] args) {
        combinations(new StringBuilder(),0);
    }

    static void combinations(StringBuilder sb, int start){
        System.out.println(sb);
        for (int i = start; i < n; i++) {
            sb.append(string.charAt(i));
            combinations(sb,i+1);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}
