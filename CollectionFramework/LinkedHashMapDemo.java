package CollectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>(3,0.3f, true); //using double linked list
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.get("two");
        map.get("three");
        System.out.println(map);

    }
}
