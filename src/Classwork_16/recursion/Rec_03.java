package Classwork_16.recursion;

public class Rec_03 {
    //123, 132, 213, 312, 321

    static String string = "123";
    static int n = string.length();
    static StringBuilder sb = new StringBuilder(string);
    public static void main(String[] args) {
        permute(0);
    }

    static void permute(int i){
        if (i==n-1){
            System.out.println(sb);
        } else {
            for (int j = i; j < n; j++) {
                swap(i,j);
                permute(i+1);
                swap(i,j);
            }
        }

    }

    public static void swap(int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
}
