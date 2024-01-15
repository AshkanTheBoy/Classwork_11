package Classwork_12.Arrays2D;

import java.util.Arrays;

public class Arrays2D {
    static int[][] arr;
    static int rows = 6;
    static int cols = 5;

    public static void main(String[] args) {
        arr = new int[rows][cols];
        //fillOrder();
        //fillOrderUD();
        fillSnake();
        print();
        travel();

    }

    static void fillOrder() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = j + 1 + i * cols;
            }
        }
    }

    static void fillOrderUD() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = i + 1 + j * rows;
            }
        }
    }

    static void fillSnake() {
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = j + 1 + i * cols;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = cols - j + i * cols;
                }
            }

        }
    }

    static void travel() {
        int i = 0;
        int j = 0;
        int step = 0;
        while (i < rows && j < cols) {
            if (step % 2 == 0) {
                i++;
                if (i < rows && j < cols) break;
            } else {
                i--;
                j++;
                if (i < rows && j < cols) break;
                System.out.println(arr[i][j]);
            }
            step++;
        }

    }


    static void print() {
        for (int[] unit : arr) {
            System.out.println(Arrays.toString(unit));
        }
    }
}
