package ComparableVsComprator;

import java.util.Comparator;

public class IdComprator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getId()-o2.getId()==0){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getId()-o2.getId();
    }
}
