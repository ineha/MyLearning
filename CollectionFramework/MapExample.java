package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
//        for (Map.Entry<String, Integer> key:map.entrySet()){
//            System.out.println("inside map");
//            System.out.println(map.entrySet());
//        }
        map.forEach((Key,value)->{
            System.out.print(Key);
            System.out.println(value);
        });

        //using iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Studen s1 = new Studen();
        Studen s2 = new Studen();
        s1.setName("java");
        s1.setId(1);
        s2.setId(1);
        s2.setName("java1");
        Map<Studen,Integer> map1=new HashMap<>();
        map1.put(s1,1);
        map1.put(s2,2);
        System.out.println(map1);
    }
}
