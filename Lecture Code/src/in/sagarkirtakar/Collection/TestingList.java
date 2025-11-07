package in.sagarkirtakar.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        strList.add("Jhon");
        System.out.println(strList.get(0));

        strList.add(1, "Jhony");
        strList.addLast("Janardhan");
        System.out.println(strList);

        strList.remove(2);
        System.out.println(strList);

        if(strList.contains("Jhon")) {
            System.out.println(strList.indexOf("Jhon"));
        }

//        System.out.println( strList.indexOf("Jhony"));

        for(String str: strList) {
            System.out.println(str);
        }

        for(int i= 0; i< strList.size(); i++ ){
            System.out.println(strList.get(i));
        }

    }
}
