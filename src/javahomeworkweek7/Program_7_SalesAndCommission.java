package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program_7_SalesAndCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input sales ID");
        int salesID = input.nextInt();
        System.out.println("Enter seller's name");
        String name = input.next();
        System.out.println("Enter sales amount");
        double amount = input.nextDouble();
        System.out.println("Enter basic salary");
        double salary = input.nextDouble();
        input.close();

        double salesCommission = 0;
        if(amount >=50000){
            salesCommission = calculateCommission(amount,35);
        }else if (amount >=30000){
            salesCommission = calculateCommission(amount,20);
        }else if (amount >=20000) {
            salesCommission = calculateCommission(amount, 10);
        }else if (amount >=10000){
            salesCommission = calculateCommission(amount,5);
        }else if (amount >=10000){
            salesCommission = calculateCommission(amount, 2);
        }
        System.out.println("Commission amount = "+ salesCommission);
    }

    static double calculateCommission(double a, double b){
        return a*b/100;
    }
}
