package Recursion;

public class SkipA {
    public static void main(String[] args) {
        String a = "abcccad";
        skip("",a);
        System.out.println(skipApple("bdapplefg"));
    }

    public static String  skipApple(String str) {
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    public static void skip(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch=='a'){
            skip(processed,unprocessed.substring(1));
        } else {
            skip(processed+ch , unprocessed.substring(1));
        }
    }
}
