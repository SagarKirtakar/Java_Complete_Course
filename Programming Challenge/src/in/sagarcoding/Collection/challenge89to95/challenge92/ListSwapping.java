package in.sagarcoding.Collection.challenge89to95.challenge92;

import java.util.Arrays;
import java.util.List;

public class ListSwapping {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list);
        Swap(list, 0, 7);
        System.out.println(list);
    }


    public static void Swap(List<Integer> list, int x , int y) {
        int temp = list.get(x);
         list.set(x, list.get(y));
         list.set(y, temp);
    }
}
