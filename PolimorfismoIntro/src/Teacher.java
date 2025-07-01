public class Teacher extends Employee{

    private String subject;

    public Teacher(String name, String surname, Integer age, Integer salary, String subject) {
        super(name, surname, age, salary);
        this.subject = subject;
    }

    //Stesso nome di metodo ,applica un override sul metodo del padre
    public void displayInfo(){
        System.out.println( "Ciao sono il docente della scuola, il mio nome è " + name + " il mio cognome è " + surname + " ho " + age + " anni e percepisco " + salary + " euro come guadagno e la materia che insegno è " + subject + " !");
    }

}
