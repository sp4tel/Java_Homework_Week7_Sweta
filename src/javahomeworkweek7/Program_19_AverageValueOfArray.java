package javahomeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Program_19_AverageValueOfArray {

    public static void main(String[] args) {

        double [] array = { 10, 20, 30, 40, 50, 60  };

        double length = array.length;

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / length;
        System.out.println("Average of array : "+average);
    }

}
