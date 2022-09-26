package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {

        //definition,nd declaration of predicate
        java.util.function.Predicate<String> checkLength = e->e.length()>5;
        //we need to call this test method and pass this string
        checkLength.test("code decode");

        List<Integer> integers = List.of(1,2,3,4,6,7);
        integers.stream().filter(e->e%2==0).forEach(System.out::println);

    }
}
