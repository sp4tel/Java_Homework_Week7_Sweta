package javahomeworkweek7;


/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Program_20_ArraySpecificValue {



        public static void main(String[] args) {
            int[] num = {12,24,36,48,60};
            int toFind = 24;
            boolean found = false;

            for (int n : num){
                if (n==toFind){
                    found= true;
                }
            }
            if (found) {
                System.out.println(toFind + "is contain");
            }else {
                System.out.println(toFind +"is not contain");
            }
        }
}





