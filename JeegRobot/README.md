Dependency Injection
- Vuol dire che una classe dipende strettamente da altre classi
- Vuol dire che un oggetto di una determinata classe non può esistere se non esitono gli oggetti delle classi collegate

Object composition
- Costruisco un oggetto utilizzando oggetti di altro tipo

Inline variable
Person[] people = {
    new Person("Giuseppe","Verdi",27),
    new Person("Antonio","Rossi",32),
    new Person("Luigi","Bianchi",42),
}

Person p1 = new Person("Giuseppe","Verdi",27);
Person p2 = new Person("Antonio","Rossi",32);
Person p3 = new Person("Luigi","Bianchi",42);

Person[] people = {p1,p2,p3}


Person[] people = {
    new Teacher("Giuseppe","Verdi",27),
    new Freelencer("Antonio","Rossi",32),
    new Student("Luigi","Bianchi",42),
}
In questa casistica una cosa chiamata Type Inference sta capendo che fare applicando proprio l'upcasting

GETTER E SETTER
- Restituiscono o settano(modificano) valori pre esistenti di attributi
- Devono essere inseriti necessariamente in presenza di modificatori di accesso non public o package degli attributi

