package in.sagarcoding.Collection.challenge89to95.challenge91;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Frequency {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Aman", "Baban", "Chintu", "Chintu");

        System.out.println(Collections.frequency(strList, "Aman"));

        System.out.println(Collections.frequency(strList, "Chintu"));
    }
}
