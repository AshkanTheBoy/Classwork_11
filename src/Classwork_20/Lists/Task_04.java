package Classwork_20.Lists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Пользователь вводит натуральные числа, пока не введет ноль.
//Программа выводит массив неповторяющихся чисел, введенных пользователем
public class Task_04 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number!=0){
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            hashSet.add(number);
        }
        System.out.println(Arrays.toString(hashSet.toArray()));
    }
}