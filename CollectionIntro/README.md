Collection
- Collezione di oggetti

Struttura dati
- In informatica è un metodo sistematico per organizzare, memorizzare e gestire i dati all'interno della memoria

Collection framework
- Esistono dei metodi preconfezionati che ci aiutano a gestire le collection

# Metodi delle collection
- add -> ci consente di aggiungere un elemento in coda di una collection
    public boolean add(Object o); 
- addAll -> ci permette di aggingere una intera collection
    public boolean addAll(Collection c);
- clear -> pulisce la collection
    public void clear();
- contains -> ci consente di verificare la presenza di un dato oggetto
    public boolean contains(Object o)
- containsAll -> ci consente di verificare se è presente una intera collection
    public boolean containsAll(Collection c);
- isEmpty -> verifica se una collection è vuota
    public boolean isEmpty();
- remove -> rimuove un elemento dalla collection
    public boolean remove(Object o)
- removeAll -> rimuove una intera collection
    public boolean removeAll(Collection c)
- size -> restituisce la dimensione della collection
    public int size();
- toArray -> restituisce una collection come array
    public Object[] toArray();

I metodi che restituiscono boolean vuol dire che ci stanno dando un feedback sulla riuscita dell'operazione


List
- E' una interfaccia cella java collection framework che rappresenta una collezione di elementi che seguono tutte le regole di una normale lista

ArrayList
- Velocissima in lettura
- Implementa l'interfaccia List ma aumenta le potenzialità di un array
LinkedList
- Velocissima in scrittura

Set
- E' una interfaccia creata per gestire i dati secondo tutte le regole degli insiemi

HashSet
- Controlla l'esistenza di duplicati utilizzando due metodi delle classi e sono equals e hashcode
TreeSet
- Ha la peculiarità che per la sua conformazione non accetta a prescindere duplicati, viene utilizzato per la sua velocità nell'ordinamento e nella ricerca
- Controlla l'ordinamento dei dati utilizzando un comparatore


MAP
- Non è una collection inteso come metodi che segue ed implementa sono differenti rispetto a quelli delle collection
- Hanno una struttura diversa rispetto alle altre collection
- L'intera logica è basata sulle chiavi
- E' una interfaccia le sue implementazioni sono HashMap e TreeMap