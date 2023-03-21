package javahomeworkweek7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Program_5_SalarySlip {

    public static void main(String args[]) {
        float c, DA, HRM, PF,TA, grossSalary;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter empID");
        int empID = input.nextInt();
        System.out.println("Enter employee name");
        String name = input.next();
        System.out.println("Enter Basic Salary Of Employee: ");
        c= input.nextFloat();

         DA = (c*8)/100;
         HRM = (c * 10) / 100;
         TA = (c*9)/100;
         PF = (c*20)/100;
         grossSalary = c + HRM + TA - PF;

        System.out.println(" _______________________________");
        System.out.println(" |        Salary Slip          |");
        System.out.println(" |_____________________________|");
        System.out.println(" | Employee Id :         " + empID +"  |");
        System.out.println(" | Employee Name :       "+name+ "   |");

        System.out.println(" |_____________________________|");
        System.out.println(" | Basic Salary :      " + c +"   |");
        System.out.println(" | HRA 10% :           " + HRM + "  |");
        System.out.println(" | TA 8% :             " + TA +"  |");
        System.out.println(" | DA 9% :             " + DA +"  |");
        System.out.println(" | PF - 20& :          " + PF + "  |");
        System.out.println(" |_____________________________|");
        System.out.println(" | Gross Salary :    "+grossSalary+"   |");
        System.out.println(" |=============================|");

    }


    }


