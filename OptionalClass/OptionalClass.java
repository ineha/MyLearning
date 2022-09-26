package OptionalClass;

import java.util.Optional;

//if we want to handle nullpointer exception
public class OptionalClass {
    public static void main(String[] args) {
        String str=null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        //if the value is null then it will return no such value present
       // System.out.println(optional.get());
        System.out.println(optional.orElse("no object in the string"));

    }
}

//when to use
//agar hm koi method call kr rhe h aur uska return type optional rhega to caleer function check kr skta h k agr value
//present ho to kam ho ni to na ho
//so hm logo ko null checks ni krne pdenge
