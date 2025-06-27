public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // String name = "Alessandro";
        // String surname = "Leo";
        // int age = 37;
        
        // System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n");

        // String name1 = "Adriana";
        // String surname1 = "Di Gennaro";
        // int age1 = 24;
        
        // System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n");

        // String name2 = "Nicola";
        // String surname2 = "Loiodice";
        // int age2 = 21;
        
        // System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n");

        // String name3 = "Simone";
        // String surname3 = "D'amico";
        // int age3 = 52;
        
        // System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n");

        // System.out.println(infoPersona1());
        // System.out.println(infoPersona2());

        // System.out.println(infos("Alessandro","Leo", 37));
        // System.out.println(infos("Simone","D'amico", 26));

        // Person ale = new Person();
        // ale.name = "Alek";
        // ale.surname = "Leo";
        // ale.age = 37;

        // infos(ale);

        // System.out.println(ale.name);

        Person ale = new Person("Alessandro","Leo", 37);
        Person simone = new Person("Simone","D'amico", 26);

        ale.introduceYourself();
        simone.introduceYourself();

    }

    // public static String infoPersona(String name, String surname, int age){
    //     return "Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n";
    // }

    // public static String infoPersona(String name){
    //     return "";
    // }

    // public static String infoPersona(String name, String surname){
    //     return "";
    // }

    // public static String infoPersona(int age, String name, String surname){
    //     return "";
    // }


    // public static String infoPersona2(){
    //     String name = "Adriana";
    //     String surname = "Di Gennaro";
    //     int age = 24;
        
    //     return "Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n";
    // }


    // public static String infos(String name, String surname, int age){
    //     return "Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n";
    // }

    // public static void infos(Person p){
    //     System.out.println("Ciao sono " + p.name + " " + p.surname + " ed ho " + p.age + " anni!\n");
    // }
}
