package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, List.of("pune,mumbai,delhi"),"Neha");
        Employee e2 = new Employee(2, List.of("pune,mumbai,delhi"),"subhi");
        Employee e3 = new Employee(3, List.of("pune,mumbai,delhi"),"ram");
        List<Employee> employees = Arrays.asList(e1, e2, e3);
        employees.stream().map(Employee::getName).forEach(System.out::println);
        employees.stream().flatMap(employee -> employee.getLocation().stream()).collect(Collectors.toSet()).forEach(System.out::println);
    }

    //Map -> transforms it to another stream
    //flatMap ->
}
