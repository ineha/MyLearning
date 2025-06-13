package Recursion;

public class LetterCombination {
    public static void main(String[] args) {
        letterCombinations("","12");
    }
    public static void letterCombinations(String p, String u) {
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = u.charAt(0) - '0';
        for(int i = (digit-1)*3 ; i < digit * 3 ;i++){
            char ch = (char)('a' + i);
            letterCombinations(p + ch, u.substring(1));
        }

    }
}
