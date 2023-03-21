package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program_12_InputNumberAlphabetSymbol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = input.next().charAt(0);
        input.close();

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is AN ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A NUMBER.");

        } else {

            System.out.println(ch + " is A SYMBOL.");
        }

    }
}
