package CollectionFramework;

import java.util.List;

public class Employee {
    private int id;
    private String name;

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, List<String> location, String name) {
        this.id = id;
        this.location = location;
        this.name = name;
    }

    private List<String> location;
}
