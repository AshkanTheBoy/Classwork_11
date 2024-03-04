package Classwork_25.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltInExceptions {
    public static void main(String[] args) {
        processNumberFormatException();
    }

    static void processInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = 0;
        try{
            a = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("ERROR");
        }
        System.out.println(a);
    }

    static void processDivisionByZero(){
        int a = 1, b;
        try {
            b = a/0;
        } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
    }

    static void processArrayOutOfBounds(){
        int[] arr = {1,2,3};
        try{
            int a = arr[3];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of the array bounds");
            e.printStackTrace();
        }

    }

    static void processNullPointer(){
        TestClass testClass = null;
        try {
            testClass.print();
        } catch (NullPointerException e){
            System.out.println("null object");
        }
    }

    static void processNumberFormatException(){
        try {
            int a = Integer.parseInt("1.2");
        } catch (NumberFormatException e){
            System.out.println("illegal number format");
        }
    }
}

class TestClass {
    private int i = 0;
    public void print(){
        System.out.println("print");
    }
}
