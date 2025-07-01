public class Freelencer extends Employee {

    private Integer commisionSalary;

    public Freelencer(String name, String surname, Integer age, Integer salary, Integer commisionSalary) {
        super(name, surname, age, salary);
        this.commisionSalary = commisionSalary;
    }

    public void displayInfo(){
        System.out.println( "Ciao sono il docente freelenecer della scuola, il mio nome è " + name + " il mio cognome è " + surname + " ho " + age + " anni e percepisco " + salary + " euro come guadagno e in più prendo per commisione " + commisionSalary + "euro!");
    }

}
