package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program_6_OddOrEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        input.close();

        if(num%2==0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
