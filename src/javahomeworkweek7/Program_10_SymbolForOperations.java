package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program_10_SymbolForOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter the operator you want(+,-,*,/):");
        char op = input.next().charAt(0);
        solve(num1, num2, op);
        input.close();
    }

    public static int solve(int num1, int num2, char op) {

        int ans = 0;
        if (op == '+') {
            System.out.println("Addition of" + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Subtraction of" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (op == '*') {
            System.out.println("Multiplication of" + num1 + "*" + num2 + "=" + (num1 * num2));
        } else if (op == '/') {
            System.out.println("Division of" + num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
            System.out.println("Operator is not available");
        }

        return ans;

    }

}

