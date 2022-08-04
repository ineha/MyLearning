package Lambda;

public class Lambda {
    public static void main(String[] args) {
        System.out.println("My app started");


        System.out.println("using Fucntional Iterface by lambda");

        MyInter l=(a)->{
            System.out.println(a);
           return a;
        };
        l.sayHello(10);
        SumInter s=(a,b)->a+b;
        System.out.println(s.sum(2,4));
    }
}
