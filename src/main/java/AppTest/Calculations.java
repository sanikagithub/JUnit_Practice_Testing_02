package AppTest;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter number 20:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter number 10:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        // Assign a variable to print the sum of the two numbers
        int numbers1 = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + numbers1);

        //Assign a variable to print the subtraction of the two numbers
        int numbers2 = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + numbers2);

        //Assign a variable to print the multiplication of the two numbers
        int numbers3 = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + numbers3);

        // Assign a variable to print the divison of the two numbers
        float numbers4 = (float)numOne / (float)numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + numbers4);

        // Assign a variable to print the modulus of the two numbers
        int numbers5 = numOne % numTwo;
        System.out.println(numOne + " % " + numTwo + " = " + numbers5);
    }

        public static double addition(double numOne, double numTwo) {
            return  (numOne + numTwo);
        }

        public static double subtraction(double numOne, double numTwo) {
            return  (numOne - numTwo);
        }

        public static double multiplication(double numOne, double numTwo) {
            return  (numOne * numTwo);
        }

        public static double divison(double numOne, double numTwo) {
            return  (numOne / numTwo);
        }

        public static double modulus(double numOne, double numTwo) {
            return  (numOne % numTwo);
        }
    }
