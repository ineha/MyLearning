package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        String s= "is2 sentence4 This1 a3";
//        String []n=s.split(" ");
//        HashMap<Character,String> map=new HashMap<>();
//        for(int i=0;i<n.length;i++){
//            int k= n[i].length()-1;
//           map.put(n[i].charAt(k),n[i].substring(0,k));
//        }
//        System.out.println(map);
//        List<Map.Entry<Character, String>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
//        String ans="";
//        for (int i=0;i<collect.size();i++){
//            ans=ans+collect.get(i).getValue();
//            ans=ans+" ";
//        }
//        System.out.println(ans);
        HashMap<String, Integer> map = new HashMap<>();
        String a[] = new String[]{"ca","caca"};
        for(String s: a){
            String st = s;
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            st = String.valueOf(ch);
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
    }
}
