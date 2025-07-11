Dipendenza transitiva
- E' una dipendenza che possiede la libreria chwe stiamo importando come dipendenza del nostro progetto

Context (contesto)
- L'insieme degli oggetti vivi all'interno della memoria che noi potremo utilizzare richiamandoli direttamente o tramite dependency injection

Inversion of Control
- Cedo il controllo sulla creazione degli oggetti al framework, noi ci preoccuperemo soltanto di utilizzare gli oggetti esistenti nel context

Best practice
- Quando una classe di configurazione fa riferimento ad un'altra classe specifica ed è l'unica configurazione esistente, il nome seguirà questa sintassi "<Nome della classe>Config.java"

Annotation
- le annotazioni sono direttive per il compilatore e quindi tramite queste il framework capisce cosa sta manipolando o cosa sta per creare

@Configuration
- Comunica al framework che la classe creata farà parte dei bean di configurazione


SCOPE_SIGNLETON E SCOPE_PROTOTYPE
- Pattern di programmazione
- Un pattern che conoscete è proprio l'MVC
- I pattern sono modi di scrivere codice seguendo delle regole
- Il framework utilizza di default lo scope singleton


Archtettura di un progetto spring
Model <-> Controller <-> Service <-> Repository

Model -> Permette la comunicazione tra un db ed un progetto BE ma non fa altro che dare un senso logico ai dati che arrivano dalla tabella

Controller -> Intercettano le chiamate http e restituiscono un output

Service -> Conterranno le logiche dette di business (cioè e logiche applicate al dominio per cui stiamo lavorando)

Repository -> Sono le uniche classi che hanno il compito di comunicare con il DB

BEST PRACTICE INTERFACE/IMPLEMENTATION
- Quando una interfaccia possiede (e sappiamo che possiederà una sola implementazione) il nome seguirà questa sintassi "<nome dell'interfaccia>Impl"

@Repository
- Identifica la classe su cui è inserita questa annotation come un Repository

@Autowired
- Attiva il meccanismo di dependency injection (andare a prendere dal contex l'oggetto specifico)


@Component
- E' la annotation padre di tutte le annotation presenti in "stereotype"

@ComponentScan
- Indica precisamente al contesto dove dovrà prendere i bean richiesti


@Service
- Fa indetificare la classe su cui è inserita come un service