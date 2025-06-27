public class Person {

    protected String name;
    protected String surname;
    protected int age;
    // public int password;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void introduceYourself(){
        System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni!\n");
    }

    //Sovrascrivere il comportamento del metodo ereditato
    //Override non è codice eseguibile, è una direttiva per il compilatore
    @Override
    public boolean equals(Object obj) {
        //Return as soon as possibile

        //Nel linguaggi di programmazione se l'if è composto da un solo comando possiamo omettere le parentesi graffe del corpo
        if(this == obj) return true; //se i riferiment sono uguali sicuramente è lo stesso oggetto

        if(obj == null || this.getClass() != obj.getClass()) return false;

        Person p = (Person) obj;
        return name == p.name && surname == p.surname && age == p.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int protection) {
        if(protection == 12345678){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
