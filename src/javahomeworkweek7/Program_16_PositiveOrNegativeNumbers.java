package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program_16_PositiveOrNegativeNumbers {

    public static void main(String []args){

        int num;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter any number: ");
        num= input.nextInt();
        input.close();

        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT IS ZERO.");

    }
}
