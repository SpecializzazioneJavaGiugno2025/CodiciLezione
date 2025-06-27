public class Student extends Person{

    public int average;

    public Student(String name, String surname, int age, int average) {
        super(name, surname, age);
        this.average = average;
    }

    // public void introduceYourselfStudent(){
    //     System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni! Sono uno studente ed ho una media di " + average + "!\n");
    // }

    // @Override
    public void introduceYourself(){
        System.out.println("Ciao sono " + name + " " + surname + " ed ho " + age + " anni! Sono uno studente ed ho una media di " + average + "!\n");
    }
}
