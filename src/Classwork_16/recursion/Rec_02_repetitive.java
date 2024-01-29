package Classwork_16.recursion;

public class Rec_02_repetitive {
    static String string = "123";
    static int n = string.length();
    static int r = 2;
    public static void main(String[] args) {
        combinations(new StringBuilder(),n,r);
    }

    static void combinations(StringBuilder sb, int start, int r){
        if (sb.length()==r){
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < n; i++) {
            sb.append(string.charAt(i));
            combinations(sb,n,r);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}
