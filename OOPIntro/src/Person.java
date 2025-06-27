public class Person {

    //Attributi(proprietà, field)
    public String name;
    public String surname;
    public int age;

    // public Person() {
    // }

    //Costruttore
    //Il costruttore ha un unico scopo, dare un valore ai suoi attributi
    //Il nome del costruttore deve essere scritto nello stesso modo del nome della classe
    //Ogni costruttore ha l'obbligo di essere public
    //Il costruttore possiede i parametri formali
    public Person(String name, String surname, int age) {
        //this definisce:"Dell'oggetto che andrò a creare, prendi il valore reale del parametro formale e assegnalo all'attributo definito nella classe"
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Metodi(Comportamenti)
    //Metodi di calsse
    //Definiscono quali comportamenti possiede una determinata classe
    public void introduceYourself(){
        //Il this definsce: "Dell'oggetto che ho creato,prendi la'ttributo definito e utilizzane il valore"
        // System.out.println("Ciao sono " + this.name + " " + this.surname + " ed ho " + this.age + " anni!\n");
        System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n");

    }

}
