Programmazione funzionale
- E' un paradigma di programmazione
- Un paradigma è un modo studiato a tavolino per risolvere un problema attraverso il codice

Modi di programmare (paradigmi di programmazione)
- Paradigma imperativo
    - Definire all'interno del codice passo dopo passso come risolvere un problema
- Paradigma dichiarativo
    - Non ci preoccuperemo del "COME" ma del "COSA"
    - Non ci interesserà di come viene risolto un problema, la logica utilizzata. Ma del risultato cioè di cosa ci restituisce quella funzinalità.
- Del paradigma dicharativo ne fa parte la programmzione funzionale
    - la programmazione funzionale FA LARGO USO DI FUNZIONE PURE
    - La programmazione funzionale fa larghissimo uso di lambda espression

ANALIZZIAMO
- people = è la lista di partenza sulla quale dobbiamo lavorare
- .stream() = E' un flusso di dati sul quale possiamo fare diverse operazioni chiamagte operazioni intermedie
- .filter() = E' una operazione intermedia che filtra in base a delle regole il contenuto dello stream
- .toList() = Trasforma il contenuto dello stream in qualcosa di effettivamente manipolabile, nel nostro caso una lista



LAMBDA EXPRESSION
person->person.gender.equals(Gender.FEMALE)

parameter -> expression



function (person){
    return person.gender.equals(Gender.FEMALE);
}

Lambda con type inference
num -> num * 2;

Lmbda senza type inference
(int num) -> num * 2;

Lambda con più parametri
(parameter1, parameter2) -> {
    code ...;
    return something;
}






FUNZIONI ANONIME
- Sono funzioni che non hanno un nome, quindi non posso richiamarle in un secondo momento
- Hanno due compiti:
    - essere utilizzate come paramentri di funzioni (callback)
    - essere assegnate ad una variabile (poter essere richia ate tramite queste)

FUNZIONI CHE POSSONO RICEVERE FUNZIONI COME PARAMETRI?????????? -> Funzioni di ordine superiore

- function(function1, function2, function2)


EXTRA
- Il codice deve essere parlante SEMPRE
- Quando creiamo anche operazioni custom dobbiamo far capire anche solo attraverso il nome cosa fa


Funzione impura
function sum(int a, int b){
    a = a + b;
    System.out.println(a);
}

Funzione pura
function sum(int a, int b){
    return a + b;
}