package in.sagarkirtakar.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Sagar", 101);
        map.put("Kunal", 102);
        map.put("Vishal", 103);

        System.out.println(map.get("Sagar"));

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.remove("Sagar"));

        System.out.println(map);

        System.out.println(map.containsKey("Sagar"));

        System.out.println(map.containsKey("Kunal"));

        System.out.println(map.containsValue(104));

        System.out.println(map.containsValue(103));

        System.out.println(map.put("Kunal", 102));

        System.out.println(map.put("Sagar", 102));

        System.out.println(map.size());

        System.out.println(map.remove("Sagar"));

        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
