import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Map<String,Person> peopleMap = new HashMap<>();

        peopleMap.put("RSSMND90T21A793H", new Person("Mario","Rossi","RSSMND90T21A793H"));
        peopleMap.put("VRNVCT78H56Z123Q", new Person("Veronica","Verdi","VRNVCT78H56Z123Q"));
        peopleMap.put("BNCLMP92P12Q345T", new Person("Luca","Bianchi","BNCLMP92P12Q345T"));

        Person marioRossi = peopleMap.get("RSSMND90T21A793H");
        System.out.println("Mario Rossi:" + marioRossi + " Attributi: " + marioRossi.name + " " + marioRossi.surname + " " + marioRossi.cf);

        boolean hasLucaBianchi = peopleMap.containsKey("BNCLMP92P12Q345T");
        System.out.println("Contiene Luca Bianchi? " + hasLucaBianchi);

        peopleMap.remove("VRNVCT78H56Z123Q");

        for (Map.Entry<String,Person> entry : peopleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Map<RubricaKey,Person> peopleMap = new HashMap<>();

        // SortedMap<RubricaKey,Person> peopleMap = new TreeMap<RubricaKey,Person>(new RubricaKeyComparator());

        // Person mario1 = new Person("Mario", "Rossi", "RSSMND90T21A793H");
        // RubricaKey r1 = new RubricaKey(mario1.cf);
        // peopleMap.put(r1,mario1);

        // Person mario2 = new Person("Mario", "Rossi", "RSSMND90T21A793H");
        // RubricaKey r2 = new RubricaKey(mario2.cf);
        // peopleMap.put(r2,mario2);

        // Person luca = new Person("Luca", "Bianchi", "BNCLCP92P12Q345T");
        // RubricaKey r3 = new RubricaKey(luca.cf);
        // peopleMap.put(r3,luca);

        // Person giovanni = new Person("Giovanni", "Verdi", "VRDGVN90T21A793H");
        // RubricaKey r4 = new RubricaKey(giovanni.cf);
        // peopleMap.put(r4,giovanni);

        // for (Map.Entry<RubricaKey,Person> entry : peopleMap.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        // for (RubricaKey key : peopleMap.keySet()) {
        //     System.out.println("Nome: " + peopleMap.get(key).name + " " + "CF: " + peopleMap.get(key).cf);
        // }

    }
}
