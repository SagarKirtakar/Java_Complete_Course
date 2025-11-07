package in.sagarcoding.Collection.challenge89to95.challenge90;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparator {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Baban", "Chaman", "Aman");

        System.out.println(list);
        sortInDecending(list);
        System.out.println(list);

    }

    public static void sortInDecending(List<String> stringList) {
//        Collections.sort(stringList);
//        Collections.reverse(stringList);

            Collections.sort(stringList, new java.util.Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.equals(o2)) {
                        return 0;
                    }else if(o1.charAt(0) < o2.charAt(0)) {
                        return 1;
                    }else {
                        return -1;
                    }
                }
            });
    }
}
