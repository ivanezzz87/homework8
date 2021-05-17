package belhard.java28;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getFirstName ().compareTo ( p2.getFirstName () );
    }
}
