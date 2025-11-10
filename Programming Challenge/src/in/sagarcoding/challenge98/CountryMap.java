package in.sagarcoding.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> CountryMap = new HashMap<>();

        CountryMap.put("India", "New Delhi");
        CountryMap.put("China", "Beijing");
        CountryMap.put("Japan", "Tokyo");
        CountryMap.put("America", "Washington DC");
        CountryMap.put("France", "Paris");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your country name: ");
        String country = input.next();

        if(CountryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s",country, CountryMap.get(country));
        }else {
            System.out.println("Sorry we don't know the capital");
        }

    }

}
