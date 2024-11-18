package org.fevzi;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("HI-LO GUESSING GAME");

        Scanner scan = new Scanner(System.in);
        Random gen = new Random(System.currentTimeMillis());

        int num, guess;
        boolean running = true;
        String answer;

        while (running) {
            running = false;
            num = gen.nextInt(100) + 1;
            System.out.println("Guess a number between 1 and 100.");
            guess = scan.nextInt();
            while (guess != num) {
                if (guess > num) {
                    System.out.println("Your guess is too high, try again!");
                    guess = scan.nextInt();
                } else {
                    System.out.println("Your guess is too low, try again!");
                    guess = scan.nextInt();
                }
            }
            num = -1;
            System.out.println("You guessed it!");
            while (num == -1) {
                answer = scan.nextLine();
                if (answer.equals("y")) {
                    num = 0;
                    running = true;
                } else if (answer.equals("n")) {
                    num = 0;
                    System.out.println("Thanks for playing!");
                } else {
                    System.out.println("Would you like to play again? [y/n]");
                }
            }
        }
    }

}