package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class ListExample {
    public static void main(String[] args) {
        User user = new User(1,"rahul");
        User user2 = new User(1,"rahul");
        User user3 = new User(3,"rahul");
        Set<User> userSet = new HashSet<User>();
        userSet.add(user);
        userSet.add(user2);
        userSet.add(user3);
        System.out.println(userSet);
    }
}
