public abstract class Person {
    protected String name;
    protected String surname;
    protected Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Stiamo dicendo che SICURAMENTE tutte le persone possono darci le informazioni sul nome, cognome ed età
    //Il come ce lo diranno le classi concrete che erediteranno da questa classe astratta
    public abstract void displayInfo();
    
}
