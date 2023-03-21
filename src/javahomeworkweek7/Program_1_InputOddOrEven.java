package javahomeworkweek7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 */
public class Program_1_InputOddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num = input.nextInt();
        input.close();

        //ternary operator to check number
        String result = num %2==0 ? "Even" : "Odd";

        System.out.println(num +" is "+ result);

    }

}
