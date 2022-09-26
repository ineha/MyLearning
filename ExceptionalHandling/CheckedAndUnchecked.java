package ExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        //ism error a rhh h taki future m exception na aye, ye just hme inform kr rha k future m a skti h exception
        //compile time p just wo hme inform krta h k future m exception ayegi
        //compile time p koi exception ni ati
        try {
            FileInputStream fileInputStream=new FileInputStream("ExceptionalHandling/ExceptionalHandling.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //compile time Exception, compile may knows that this class might not present  so we need to report this
       // Class.forName("com.mysql.jdbc.Driver");

        //unchecked means airthematic

    }
}
