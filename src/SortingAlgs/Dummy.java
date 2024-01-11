package SortingAlgs;

import java.util.Arrays;

/*
Глупая сортировка. Когда встречается пара неотсортированных элементов, меняем их местами
и возвращаемся к началу
     */
public class Dummy {
    static int[] arr={3,1,2,6,7,5,2};
    public static void main(String[] args) {
        dummySort();
        System.out.println(Arrays.toString(arr));
    }
    public static void dummySort() {
        int i=0;
        while (i<arr.length-1)
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i+1);
                i=0;
            }
            else i++;
    }
    static void swap(int[] arr, int i, int j){ //ссылочный тип
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
