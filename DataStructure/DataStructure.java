package DataStructure;

import java.util.Stack;

public class DataStructure {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //if the stack is empty and still you are removing then it will throw exception
    }
}
