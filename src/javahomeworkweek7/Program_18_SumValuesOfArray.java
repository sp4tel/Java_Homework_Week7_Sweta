package javahomeworkweek7;

/**
 * Write a Java program to sum values of an array.
 */
public class Program_18_SumValuesOfArray {

    public static void main(String[] args) {
        int myarray[] = {11, 21, 31, 41, 51};
        int length = myarray.length;

        int sum = 0;

        for (int i : myarray)
            sum += i;
        System.out.println("The sum is " + sum);
    }


}
