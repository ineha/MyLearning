package CoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class learn {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        String s="()[]{}";
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                System.out.println("false");
        }
        List<Integer> list = new ArrayList<>();
        System.out.println(stack.isEmpty());

        System.out.println("----------------------------------------------------------");
//        Student student1 = new Student(s);
//        student1.name="ne";
//        student1.i=20;
//        student1.details();
//        student1.show();
//        System.out.println("----------------------------------------------------------");
//        //Student student2=new Student(s);
//        student2.name="Neharika";
//        student2.i=30;
//        student2.details();
//        student2.show();
        System.out.println("----------------------------------------------------------");
        Dog dog=new Dog();
        dog.speak();
        System.out.println("----------------------------------------------------------");
        String hello ="hello";
        System.out.println(hello.substring(1,4));
        System.out.println(s());
        Animal.a();
        Animal.a(2);
    }

    public static String s(){
        try{
            System.out.println("hello");
            return "d";

        }

        finally {
            System.out.println("hi");
            return "k";
        }

    }
}
