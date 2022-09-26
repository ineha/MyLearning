package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("java",1);
        map.put("c++",2);
        map.put("c",5);
        map.put("python",10);
        for (String key:map.keySet()){
            System.out.println(map.get(key));
        }

        map.forEach((Key,value)->{
            System.out.print(Key);
            System.out.println(value);
        });

        //using iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
