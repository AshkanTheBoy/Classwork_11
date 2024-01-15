package Classwork_12.games;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = random.nextInt(100)+1;
        boolean status = true;
        while (status){
            System.out.println();
            System.out.println("GUESS THE NUMBER: ");
            int guess = scanner.nextInt();
            if (guess>n){
                System.out.println("TARGET IS LOWER");
            } else if (guess<n){
                System.out.println("TARGET IS HIGHER");
            } else if (guess == n) {
                System.out.println("YOU WON!");
                status = false;
            }
        }
    }
}
