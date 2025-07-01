public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //Classi astratte NON POSSONO ESSERE ISTANZIATE
        //Person p1 = new Person("Alesssandro","Leo",37);

        Employee e1 = new Employee("Giuseppe", "Verdi", 38 , 1550);

        Student aleC = new Student("Alessandro", "Caporeale", 27, 9);

        Teacher alek = new Teacher("Alek", "Leo", 37, 5555, "Java");

        Freelencer adri = new Freelencer("Adriana", "Di Gennaro", 17, 50, 250);

        // e1.displayInfo();
        // aleC.displayInfo();
        // alek.displayInfo();
        // alek.displayInfoTeacher();
        // adri.displayInfo();
        // adri.displayInfoFreelencer();

        System.out.println(e1.getInfo());
        System.out.println(aleC.getInfo());
        System.out.println(adri.getInfo());
    }
}
