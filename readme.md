Spring data -> Un dei progetti di spring che ha il compito di consentirci la comunicazione con i database
            -> Natura agnostica, vuol dire che funzziona con qualsiasi tipo di database Sql e NoSql
            -> Concentra i suoi concetti sui Repository, classi con l'unico scopo di comunicare con il DB

JPA
- E' una specifica, un insieme di regole da seguire per cominicare correttamente con un DB
- Hybernate(ORM) è una sua implementazione scritta proprio per pprogetti Spring Java

ORM
- Object Relation Mapper
- Consente di mappare oggetti, nel nostro caso saranno i modelli, con le corrispettive tabelle nel db
- Un orm traduce anche comandi scritti in un linguaggio specifico in query da attuare nel DB

MODELLI
- Sono classi che contengono tutte le caratteristiche di una classe
- Mappano gli atributi con i campi di una tabella
- Il nome della tabella per CONVENZIONE corrisponde esattamente al plurale del nome del modello
(Detto fra noi, un modello è una scatola con degli scompartimenti etichettati con il nome degli attributi, negli scopartimenti ci finiranno i dati che corrispondono per nome del campo a quello dell'etichetta)

Primary Key
- Chiave primaria, e' un dato UNIVOCO che ci cinsente di identificare un'ivocamente un dato
- Una chiave primaria per essere UNIVOCA VUOL DIRE CHE NON SI DEVE RIPETERE ALL'INTERNO DELLA NOSTRA TABELLA

ID
- Un numero, INTERO-POSITIVO-AUTOINCREMENTALE

Foreign Key
- E' una chiave utilizzata per relazionare fra di loro due o più tabelle
- Fa riferimento alla chiave primaria delle tabelle relazionate
- Se esiste nella tabella in cui è dichiarato DEVE esistere nella tabella relazionata (Vincolo di integrità referenziale)
- Nel caso di un id INTERO-POSITIVO e non è univoco, può ripetersi

DIAGRAMMA ER
- Diagramma Entità-Relazione

1-N
- L'inverso di una relazione 1 a N è una 1-1

N-N
- viene definita una 1-N a doppia via