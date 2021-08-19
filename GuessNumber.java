package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int round=1;
        System.out.println("Welcome to Guess Number Game!\nSelect number in between range of  0 to 20");

        Random random = new Random();
        int randnumber = random.nextInt(20);

        while (true) {
            System.out.print("Guess Number to catch computer Number( 0 to 20 ): ");
            Scanner scanner = new Scanner(System.in);
            int guessednumber = scanner.nextInt();

            if (guessednumber>20){
                System.out.println("Do choose number from 0 to 20");round-=1;
            }
            else if (guessednumber == randnumber) {
                System.out.println("Congratulations! You have guessed the number right!\n:-)--------------------------:-)");
                break;
            }
            else if (guessednumber > randnumber) {
                System.out.println("You Guess Greater than computer NumberTry again.....");
            }
            else {
                System.out.println("You Guess Less than computer NumberTry again.....");
            }
            round++;
        }
        System.out.println("You took "+round+" rounds to guess the Number.");


    }
}
