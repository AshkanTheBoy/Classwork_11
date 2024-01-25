package Classwork_15;

import java.util.Arrays;

public class Task_07 {
    public static void main(String[] args) {
        String s = "JaggedEdge";
        char[][] arr = new char[s.length()][];
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new char[i+1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
