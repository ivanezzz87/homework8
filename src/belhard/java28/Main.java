package belhard.java28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<> ();
        list.add ( new Person ( "Andrey", "Petrov", new Address ( "Minsk", "Masherova", 99 ) ) );
        list.add ( new Person ( "Yura", "Artemov", new Address ( "Mogilev", "Sovetskaya", 5 ) ) );
        list.add ( new Person ( "Ira", "Romanova", new Address ( "Brest", "Oktyabrskaya", 30 ) ) );
        list.add ( new Person ( null, "Ivanov", new Address ( "Minsk", "Dzerzhinskogo", 120 ) ) );
        list.add ( new Person ( "Nick", null, new Address ( "Vitebsk", "Lenina", 2 ) ) );
        list.add ( new Person ( "Petr", "Andreev", null ));
        List<Person> modified = list.stream().filter ( person -> person.getFirstName () != null & person.getLastName () != null & person.getAddress () != null )
                .sorted (new PersonComparator ())
                .collect ( Collectors.toList () );
        List<String> stringList = modified.stream().map (  p -> p.toString () ).collect ( Collectors.toList () );
        stringList.stream ().forEach ( System.out::println );
    }
}
