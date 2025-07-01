OOP
- Dare un senso digitale a entità del mondo reale in base ad un dominio specifico

POLIMORFISSMO
- Essere polimorfo vuol dire assumere comportamenti specifici in fase di utilizzo ma essere costruiti in modo generico
- Il polimorfismo si realizza tramite le classi astratte e la sovrascrittura(override) dei metodi

CLASSI ASTRATTE
- Sono classi generiche che descrivono genericamente quali sono le caratteritiche comuni a entità scpecifiche
- Ciò che caratterizza una classe astratta è che contiene ALMENO UN METODO ASTRATTO, può contenere anche metodi concreti
- NON POSSONO ESSERE ISTANZIATE

METODO ASTRATTO
- Non ha un corpo(non contiene logiche)
- Possiede la keyword "abstract"
- Deve sempre possedere il tipo di ritorno del metodo(come già sappiamo)

DOMINIO SCUOLA(Aulab)
Persone:
    - Dipendenti:
        - Docente(interno)
        - Freelencer
    - Studenti

@Override(Annotation)
- Solo la annotation non è codice eseguito
- E' una direttiva per il compilatore
- Chiarezza del codice, ci aiuta a capire meglio cosa sta avvenendo
- Verifiche del compilatore, il compilatore capis ce come deve comportarsi
- Documentazione, permette di capire in fase documentativa cosa sta succedendo
- Aiuta la realizzqazione del polimorfismo

Ereditarietà
- Classi figlie vedono tutto ciò che è contenuto nel padre
- Il padre non vede nulla di ciò che è contenuto nei figli, non ha idea nemmeno di quanti possano essere
- Classi sorelle non si vedono tra di loro
- Java e' a ereditarietà singola, ogni classe può ereditare SOLO E SOLTANTO DA UNA CLASSE ma può implementare infinite interfacce

ISTANZIARE
- Creare un nuovo iggetto da una classe specifica

INTERFACCIA
- Non è una classe
- Ha la keyword interface
- Possiede solo quelle che vengono chiamate "Firme dei metodi"
- I metodi dichiarati NON HANNO un corpo




FIRMA DI UN METODO
- E' la struttura che un metodo a livello di dichiarazione e sintassi deve avere






 public void infoTeacher(){
        System.out.println( "Ciao sono il docente e la materia che insegno è " + subject + " !");
    }