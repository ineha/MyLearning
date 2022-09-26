package ExceptionalHandling;

public class ExceptionalHandling {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        //unwanted event that might occurs, we are not repairing it
        try {
            System.out.println(2/0);
        }
       catch (ArithmeticException e){
           System.out.println(e);
       }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block");
        }

        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");

        //error finally without try
//  finally {
//            System.out.println("finally block");
//        }

    }
}
