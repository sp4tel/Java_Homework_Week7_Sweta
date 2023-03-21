package javahomeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program_8_CityNameFromAToF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an alphabet from A to F  ");

        String alphabet = input.next() ;
        input.close();
        if("A".equals(alphabet)){
            System.out.println("Aylesbury");
        }else if("B".equals(alphabet)){
            System.out.println("Bradford");
        }else if("C".equals(alphabet)){
            System.out.println("Cardiff");
        }else if("D".equals(alphabet)){
            System.out.println("Dublin");
        }else if("E".equals(alphabet)){
            System.out.println("Edinburgh");
        }else if("F".equals(alphabet)){
            System.out.println("Florence");
        }else {
            System.out.println("Invalid entry.");
        }

    }
}
