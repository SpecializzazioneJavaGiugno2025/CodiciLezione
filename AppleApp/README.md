TRACCIA
- Immaginiamo di essere stati incaricati di sviluppare una applicazione per un inventario di un contadino. 
Il cliente vuole una funzionalità per trovare tutte le mele verdi nell'inventario.
Il giorno dopo, però, ci chiede una funzionalità per trovare tutte le mele che pesano più di 150g. 
Il giorno dopo ancora ci chiede una funzionalità che richiede entrambi i requisiti precedenti.


Behaviour parametrization
- Assegneremo un comportamento come parametro di una funzione


LE LAMBDA SONO FUNZIONI CHE POSSONO ESSERE USATE COME VALORI

Lambda che filtra le mele rosse
- prendi in ingresso una mela e controlla se il suo colore è rosso
- (Apple apple) -> apple.getColor().equals(Color.RED)

Lamda che filtra in base al peso
- prendi in ingresso una mela e controlla se il suo peso è maggiore di 150
- (Apple apple) -> apple.getWeight() >= 150;

LE LAMBDA CHE ABBIAMO CREATO RISPETTANO L'INTERFACCIA APPLE PREDICATE INTERFACE