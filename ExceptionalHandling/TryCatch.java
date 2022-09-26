package ExceptionalHandling;

public class TryCatch {
    public static void main(String[] args) {
        //try k sath hmesha catch ya finaly ana chahiye
        //akela cath ya akela finally ya try ni lga skte
        try{
            System.out.println(10/0);
            //exception ati h usk bad koi line execute ni hogi
            System.out.println("inside try");
        }
        //catch block m ni jayega flow agar execption ni ayegi to
        //we can use multiple catch blocks here, but the first should not be the parent class
        catch (Exception e){
            //it prints  exception name, description, Stack trace
            //it is the most used method to print stack trace
          e.printStackTrace();
            //it prints  exception name,
            System.out.println(e.toString());
            //it prints description
            System.out.println(e.getMessage());

        }
       //try catch finally sath m hone chahiye beech m koi code ni hoga
        finally {
            System.out.println("inside finally");
        }
    }
}
