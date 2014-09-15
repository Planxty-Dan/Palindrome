package com.example.Palindrome;

/**
 * Created by admin on 9/15/14.
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        String userInput;
        String reverseInput;
        Boolean progLoop = true;
        String tryAgain;

        System.out.println("I will tell you if a word or phrase is a palindrome.\n" +
                "I will do this because I am nice.\n");

        while (progLoop) {
            System.out.println("Type a word or phrase:\n");

            userInput = myScan.nextLine();

            userInput = userInput.toLowerCase();
            userInput = userInput.replaceAll(" ", "");
            System.out.println(userInput);
            reverseInput = new StringBuffer(userInput).reverse().toString();
            System.out.println(reverseInput);

            if (userInput.equals(reverseInput))
                System.out.println("That is a palindrome, yay!");
            else
                System.out.println("That isn't a palindrome, sorry.");

            System.out.println("Want to try another word? (y/n)");

            tryAgain = myScan.nextLine();
            if (tryAgain.toLowerCase().equals("n"))
                progLoop = false;
        }
    }
}
