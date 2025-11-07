package in.sagarkirtakar.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {

    public static void main(String[] args) {

        Set<String> name = new HashSet<>();

        System.out.println(name.add("Kunal"));
        name.add("Vishal");
        name.add("Sagar");
        Utility.print(name);

       boolean isAdded =  name.add("Sagar");
        System.out.println("Name is added: " + isAdded);
        System.out.println(name);

        name.remove("Sagar");
        System.out.println(name);

        System.out.println(name.contains("Vishal"));

        System.out.println(name.size());

        System.out.println(name.isEmpty());

        Utility.print(name);


    }
}
