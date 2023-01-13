package ComparableVsComprator;

public class Employee implements Comparable<Employee>{
    private int id;
    private String nme;

    public Employee(int id, String nme) {
        this.id = id;
        this.nme = nme;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nme='" + nme + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
}
