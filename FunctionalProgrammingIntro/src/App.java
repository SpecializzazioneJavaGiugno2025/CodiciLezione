import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Person> people = List.of(
            new Person("Andrea", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Paola", Gender.FEMALE),
            new Person("Roberto", Gender.MALE),
            new Person("Marco", Gender.MALE)
        );

        //Approccio imperativo
        //Estrapolare tutte le persone che hanno come gender FEMALE
        // List<Person> females = new ArrayList<>();

        // for (Person person : people) {
        //     if(Gender.FEMALE.equals(person.gender)){
        //         females.add(person);
        //     }
        // }

        // for (Person person : females) {
        //     System.out.println(person.name);
        // }


        //Approccio dichiarativo
        //Programmzione funzionale
        List<Person> females = people.stream().filter(person->person.gender.equals(Gender.FEMALE)).toList();

        //Lista dopo la filter
        System.out.println("Lista dopo la filter");
        for (Person person : females) {
            System.out.println(person.name);
        }

        //Lista originaria
        System.out.println("Lista originaria");
        for (Person person : people) {
            System.out.println(person.name);
        }


        // List<Integer> numbers = List.of(
        // 2,5,6,7,8,9,12
        // );


        // Integer sum = numbers.stream()
        //     .filter(number -> number % 2 == 0)
        //     .map(number -> number*number)
        //     .reduce(0, Integer::sum);


        // System.out.println(sum);

    }
}
