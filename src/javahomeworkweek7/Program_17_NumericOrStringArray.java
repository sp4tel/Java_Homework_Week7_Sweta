package javahomeworkweek7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Program_17_NumericOrStringArray {

    public static void main(String[] args){

        int[] year = {1843,2004,1755,2023,1866};

        String[] name = {"Cinderella", "Barbie","Sophia","Anna","Elsa"};

        System.out.println("Original numeric array : "+ Arrays.toString(year));
        Arrays.sort(year);
        System.out.println("Sorted numeric array : "+Arrays.toString(year));

        System.out.println("Original string array : "+Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted string array : "+Arrays.toString(name));
    }
}
