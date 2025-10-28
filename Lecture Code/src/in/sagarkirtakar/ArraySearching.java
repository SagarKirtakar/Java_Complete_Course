package in.sagarkirtakar;

import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int [] number = {10,20,30,40,50,60};
        System.out.println("Welcome to Array Searching\n");

        System.out.println("Enter the number you want to search: ");
        int num = obj.nextInt();

        boolean isFound = isFound(number, num);

        if(isFound) {
            System.out.println("Number found in array..!");
        } else {
            System.out.println("Number not found in array..");
        }

    }

    public static boolean isFound(int [] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if(num == arr[index]) {
               return true;
            }
            index ++;
        }
        return false;
    }

}
