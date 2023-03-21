package javahomeworkweek7;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Program_3_MarkSheet {
    String name;
    int roll, Maths, Science, English;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  Student Name");
        String name = input.nextLine();
        System.out.println("Enter roll number");
        int num = input.nextInt();
        System.out.println("Enter marks in Maths:");
        int m = input.nextInt();
        System.out.println("Enter marks in Science:");
        int m1 = input.nextInt();
        System.out.println("Enter marks in English:");
        int m2 = input.nextInt();
        input.close();
        int total = m + m1 + m2;
        float percentage = total / (300.0f) * (100.0f);

        String result = "";
        if (percentage >= 80.0) {
            result = "A+";
        } else if (percentage >= 60.0) {
            result = "A";
        } else if (percentage >= 50.0) {
            result = "B";
        } else if (percentage >= 40.0) {
            result = "C";
        } else if (percentage > 35.0) {
            System.out.println("Pass");
        } else if (percentage < 35.0) {
            System.out.println("Fail");
        }


        System.out.println("------------------------------------------" );
        System.out.println("|                                         |");
        System.out.println("|            Mark Sheet                   |");
        System.out.println("|                                         |");
        System.out.println("------------------------------------------");
        System.out.println("|   Name             : " + name+"         |");
        System.out.println("|   Roll No          : " + num+"         |");
        System.out.println("|---------------------------------------- |");
        System.out.println("|   Subjects         :  Marks             |");
        System.out.println("|---------------------------------------- |");
        System.out.println("|   Math             :  " + m +"                |");
        System.out.println("|   Science          :  " + m1+"                |");
        System.out.println("|   English          :  " + m2+"                |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|   Total            :"+ total +"                 |");
        System.out.println("-------------------------------------");
        System.out.println("|   Percentage       :"+ percentage+"                |");
        System.out.println("    Grade            : "+result +"                   |");


    }
}
