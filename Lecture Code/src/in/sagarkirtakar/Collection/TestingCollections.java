package in.sagarkirtakar.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        numList.add(8);
        numList.add(2);
        numList.add(5);
        numList.add(-75);

        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        Collections.shuffle(numList);
        Utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);

        unmodifiable.add(25);
        Utility.print(numList);
    }
}
