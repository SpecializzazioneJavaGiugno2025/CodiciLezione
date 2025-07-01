public class Employee extends Person implements Info{
    protected Integer salary;

    public Employee(String name, String surname, Integer age, Integer salary) {
        //super si riferisce al costruttore del padre
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ciao sono il dipendente della scuola, il mio nome è " + name + " il mio cognome è " + surname + " ho " + age + " anni e percepisco " + salary + " euro come guadagno!");
    }

    @Override
    public String getInfo() {
       return "Nome: " + name + ", Cognome: " + surname + ", Età: " + age + ", Salario: " + salary;
    }
}
