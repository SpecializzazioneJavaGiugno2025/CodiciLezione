public class Student extends Person implements Info{
    protected Integer average;

    public Student(String name, String surname, Integer age, Integer average) {
        super(name, surname, age);
        this.average = average;
    }

    @Override
    public void displayInfo() {
         System.out.println("Ciao sono uno studente della scuola, il mio nome è " + name + " il mio cognome è " + surname + " ho " + age + " anni e la mia media dei voti è " + average + "!");
    }

    @Override
    public String getInfo() {
       return "Nome: " + name + ", Cognome: " + surname + ", Età: " + age + ", Media: " + average;
    }

}
