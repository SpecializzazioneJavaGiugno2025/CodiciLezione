import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //La nostra lista conterrà solo ed esclusivamente oggetti di tipo person
        // List<Person> people = new ArrayList<Person>();
        //Dichiarazione con type inference
        //List<Person> people = new ArrayList<>();


        // List<Person> people = new LinkedList<Person>();

        // people.add(new Person("Luca","Bianchi",29));
        // people.add(new Person("Andrea","Rossi",35));
        // people.add(new Person("Giuseppe","Verdi",32));
        // people.add(new Person("Luigi","Neri",41));

        List<Person> people = new LinkedList<Person>(
            List.of(
                new Person("Luca","Bianchi",29),
                new Person("Andrea","Rossi",35),
                new Person("Giuseppe","Verdi",32),
                new Person("Luigi","Neri",41)
            )
        );

        //E' sempre una lista ma si dice essere immutabile
        // List<Person> people =  List.of(
        //         new Person("Luca","Bianchi",29),
        //         new Person("Andrea","Rossi",35),
        //         new Person("Giuseppe","Verdi",32),
        //         new Person("Luigi","Neri",41)
        // );

        // // people.add(2,new Person("Anna","Viole", 27));

        people.addAll(
            2,
            List.of(
                new Person("Marta","Bianchi",32),
                new Person("Antonio","Neri",41)
            )
        );

        // Person p2 = people.get(5);
        // System.out.println(p2.getNome() + " " + p2.getCognome() + " " + p2.getEta());


        for (Person person : people) {
            System.out.println(person.getNome() + " " + person.getCognome() + " " + person.getEta());
        }

        System.out.println("Dopo la set");
        people.set(1, new Person("Anna","Viole", 27));

        for (Person person : people) {
            System.out.println(person.getNome() + " " + person.getCognome() + " " + person.getEta());
        }

        people.remove(1);

        //Dopo la remove
        System.out.println("Dopo la remove");
        for (Person person : people) {
            System.out.println(person.getNome() + " " + person.getCognome() + " " + person.getEta());
        }

        people.clear();

        //Dopo il clear
        System.out.println("Dopo la clear");
        for (Person person : people) {
            System.out.println(person.getNome() + " " + person.getCognome() + " " + person.getEta());
        }

        Iterator<Person> it = people.iterator();
        while(it.hasNext()){
            Person p = it.next();
            System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
        }

    }
}
