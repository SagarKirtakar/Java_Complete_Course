package in.sagarcoding.Collection.challenge89to95.challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {

        Set<Character> set = new HashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String userString = input.next();

        for (char ch : userString.toCharArray()) {
            set.add(ch);
        }
        System.out.println(set);
        System.out.printf("your string has %d unique characters", set.size());
    }

}
