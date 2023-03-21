package javahomeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program_9_CityNameSwitchStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter City Name Start from A to F");
        char name = input.next().charAt(0);
        input.close();

        switch (name) {
            case 'A' :
                System.out.println("Aberdeen");
                System.out.println();
                break;

            case 'B':
                System.out.println("Birmingham");
                break;

            case 'C':
                System.out.println("Coventry");
                break;

            case 'D':
                System.out.println("Derby");
                break;

            case 'E':
                System.out.println("Erdington");
                break;

            case 'F':
                System.out.println("Fairbourn");
                break;

            default:
                System.out.println("Invalid Character");
        }
    }
    }

