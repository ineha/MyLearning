package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<Integer> inner = new ArrayList<>();
    static List<List<Integer>> outer = new ArrayList<>();

    public static void main(String[] args) {
        permutations("","aaa");
        List<Integer> processed = new ArrayList<>();
        List<Integer> unprocessed = new ArrayList<>();
        int nums[] = new int[] {1,2,3};
        for(int e:nums){
            unprocessed.add(e);
        }
        System.out.println(permuatationsArray(processed, unprocessed));

    }

    private static List<List<Integer>> permuatationsArray(List<Integer> processed, List<Integer> unprocessed) {
            if(unprocessed.isEmpty()){
                List<List<Integer>> res= new ArrayList<>();
                res.add(processed);
                return res;
            }
            List<List<Integer>> ans= new ArrayList<>();
            Integer elt=unprocessed.get(0);
            for(int i=0;i<=processed.size();i++){
                List<Integer> proT=new ArrayList<>();
                for(Integer e:processed.subList(0,i)){
                    proT.add(e);
                }
                proT.add(elt);
                for(Integer e:processed.subList(i,processed.size())){
                    proT.add(e);
                }
                List<List<Integer>> ansFrom=permuatationsArray(proT,unprocessed.subList(1,unprocessed.size()));
                ans.addAll(ansFrom);
            }
            return ans;
        }


    public static void permutations(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for(int i = 0;i <= processed.length();i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutations(first+ch+second, unprocessed.substring(1));
        }
    }
}
