package Classwork_12;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,11,15,16};
        System.out.println(runBinarySearchIteratively(arr,5,0,arr.length-1));
    }
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
