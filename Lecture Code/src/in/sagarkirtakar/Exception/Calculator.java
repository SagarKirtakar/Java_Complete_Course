package in.sagarkirtakar.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to Division calculator..!");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any two number");
        int firstInput = obj.nextInt();
        int secondInput = obj.nextInt();

       try {
           int result = firstInput / secondInput;
           System.out.printf("Result is %d" , result);
       } catch(ArithmeticException i) {
           System.out.printf("%s , enter valid values" , i.getMessage());
       }

    }
}
