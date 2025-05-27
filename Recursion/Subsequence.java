package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String a = "abc";
        sequence("",a);
        System.out.println(list);
    }
    public static void sequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            list.add(processed);
            System.out.print(processed+" ");
            return;
        }
        char ch = unprocessed.charAt(0);
        sequence(processed + ch, unprocessed.substring(1));
        sequence(processed, unprocessed.substring(1));
    }

}


