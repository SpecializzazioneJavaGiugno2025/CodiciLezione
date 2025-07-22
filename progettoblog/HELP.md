MYSQL
- Gestore di database (RDBMS)

progettoblogiugno2025

application.properties
- Contiene tutte le configurazioni che ci saranno utili all'interno del progetto ad esempio connessioni con il DB, Driver per chiamate api ecc ecc


jdbc: -> utilizza il drive JDBC (java db managment system)
mysql:// -> chiama il gestore mysql
localhost: -> lo troveri sulla macchina locale
3306/ -> alla porta 3306
springBlogDatabase -> il databse si chiama cosi

com.mysql.jdbc.Driver
- driver per la connessione effetiva al db con mysql

Entity Manager
- Definito nelle Jpa è proprio utilizzato per mappare le entità


@Entity -> definisce una classe come entità da gestire a livello di db

@Table(name = "authors") -> Definisce la tabella collegata all'entità

@Id -> Definisce l'id come primary key

@GeneratedValue -> Il modo in cui dovrà essere generato da te automaticamente il valore
(strategy = GenerationType.IDENTITY) -> dovrà seguire una strategia ben precisa 
IDENTITY -> definisce proprio l'auto-increment

In spring i model sono chiamati POJO
 - Plain Old Java Object

POJO
- Sono classi normalissime ma hanno costrutto vuoti, e vanno specificati

Quando stiamo mappando le relazioni inverse, dette anche senza FK, esiste l'attributo mapped by

Repository
- Uniche classi che possono comunicare con il database
- Lo fanno tramite quelle che vengono definite query derivate o query native

Derived query
- Metodi che inseriamo all'interno dell'interfaccia e che a seconda del nostro bisogno devono seguire una sintassi ben precisa
- findBy -> select * from authors where
- il valore che segue la find by diventerà il valore da inserire dopo "=" nella where
- Il nome che segue il findBy deve necessariamente essere uguale al nome della proprietà all'interno del modello

KISS
- Keep
- it
- simple
- STUPID

CLIENT-SERVER
- In questa architettura esiste un client che fa le richieste(vedremo request) ed un server che risponde(response) se può.

PROTOCOLLO
- Insieme di regole affinchè due entità possano comunicare e capirsi a vincenda

HTTP
- Hiper Text Transfer Protocol
- Trasferire ipertesti (sono testi che contengono anche qualcosa in più come ad esempio i link, immagini ecc ecc)

DNS
- Spesso associato ad una rubrica telefonica
- Ci permette di tradurre indirizzi scritti in linguaggio naturale, in indirizzi ip corrispondenti

URL
- Identificatore univoco di una risorsa

URI
- Identificatore univoco di una risorsa specifica allìinterno di un sistema
- Un url contiene un uri non l'inverso


http://aulab.it/blog?key1=value&key2=value#id

http: -> protocollo
//aulab.it -> TLD(top level domain), dominio di primo livello
            -> aulab = dominio di secondo livello
            -> italia.aulab.it -> "italia" è definito dominio di terzo livello
            -> "subdominio.dominio-di-secondo-livello.dominio-di-primo-livello

/blog -> URI
?key1=value&key2=value -> Query string, sono valori che aiutano a identificare precisamente ciò che vogliamo ottenere
                       -> Aiuta l'uri ad essere sempre più preciso

#id -> e' l'lemento sul quale sono posizionato


Tipologie di risorse
- Risorse statiche -> css, javascript, immagini ì, file multimediali
- Servizi/Api -> raggingere azini specifiche tramite un uri (vedremo che lo chiameremo anche endpoint)
- Contenuti dinamici -> Paginette che cambiano il loro contenuto dinamicamente

METODI HTTP
- GET -> Restituisce una risorsa
- POST -> Crea una risorsa
- PUT -> Modifica una risorsa
- PATCH -> Modifica una parte della risorsa
- DELETE -> Cancella la risorsa

MESSAGGI DI RISPOSTA
- Numeri che il server restitusce per definire uno stato di elaborazione

1xx: messaggi informativi
2xx: successo (richiesta soddisfatta)
3xx: redirect (non c'è risposta immediata, ma viene detto come ottenere risposta)
4xx: client error (richieta non soddisfatta perché sbagliata)
5xx: server error (richiesta non soddisfatta per problema interno del server)

Esempi:
200: ok
301: spostato permanentemente
304: non modificato
400: richiesta incomprensibile
401: accesso non autorizzato
404: pagina non trovata
500: errore interno del server

Pattern MVC(Model,View,Controller)
- Pattern -> è una modalità di scrittura del codice
- MVC -> E' il modo per riassumere un concetto. Esistono dei modeeli che ci cosentono di gestire i dati, esistono dei controller che manipolano dati e viste, esistono delle viste che mostrano il risultato della manipolazione dei dati

Controller
- Controller API -> sono responsabili della gestione delle richieste HTTP provenienti da altre applicazioni o servizi tramite API. Rispondono alle richieste RESTful (chiariremo fra pochissimo) o SOAP e restituiscono dati in formato JSON, XML o altro formato appropriato per il client.
- Controller WEB -> sono responsabili della generazione e restituzione di pagine HTML dinamiche ai client. Possono utilizzare un motore di template come Thymeleaf (che vedremo) per generare le viste dinamicamente, consentendo al backend di comporre l'HTML prima di inviarlo al client.


JSON
- File di testo
- Javascript Object Notation -> Indica il modo di rappresentare i dati che seguon una sintassi ben specifica

Richieste Restful
- Acronimo di Representational State Transfer è una architettura di stile di progettazione creata per definire una forma di comunicazione
- I servici che rispondo in Rest vengono spesso chiamati RestFul service
- Tutto questo solo per dire che: Nella risposta testuale dobbiamo inserire tutti i dati necessari, si dice infatti essere senza stato.
- "Stateless" un serve non è tenuto a mantere traccia di ciò che ci ha dato in risposta ma ci restituisce TUTTO QUELLO I CUI POTREMMO AVER BISOGNO IN UNA SOLA RISPOSTA


@ResponseBody
- E' una annotation che definisce il tipo di risposta di quell'handler, in particolare di default sta dicendo che la risposta sarà un json

Il metodo di richiamo del repository direttamente dal controller senza passare dal service viene definito anti-pattern.
Lecitissimo utilizzarlo se ne abbiamo il bisogno. Best practice dice che bisogna passare dal service. Ma possiamo rompere la regola.

Iterable
- E' una struttura dati che può essere iterata, ciclata

localhost:8080/authors

@RequestMapping(value = "/authors", method=RequestMethod.GET)
- Ci permette di mappare un handler su un uri specifico e ne definisce anche la tipologia di metodo http

JsonIgnoreProperties
- Comunica che quando verrà chiamato l'oggetto dovrà ignorare la proprietà definita tra parentesi

@PathVariable("id")
- Comunica all'handler che nell'url di endpoint sta arrivando un parametro e questo è identificato da un nome specifico (id) quindi deve catturare quel dato


Optional<T>
- In spring un otpional è una tipologia di oggetto che può esistere come può non esistere
- Metodologia per gestire al meglio i null
- Se iptional arriva con un dato effettivo allora potremo farci delle logiche come ad esmepio la get che trasforma l'oggetto optional restituito, se esiste, in un oggetto reale, altrimenti sarà un oggetto vuoto


Annotation sui metodi
@GetMapping
@PostMapping
@PutMapping
@DeleteMapping 
@PatchMapping



@RequestBody
- Sta comunicando all'handler che nella richiesta gli arriverà un body

Richieste di tipo post,put,patch,delete
- Non si possono fare nella barra degli URL
- La barra degli url può fare SOLO chiamate di tipo GET


Metodo Save()
- In spring non esiste un metodo update
- L'unico modo che ha per capire se fare una update o una create è tramite l'id
- Se l'id esiste allora capisce che deve aggiornare, se l'id non esiste capisce che deve creare


Best practice per implementazione interfacce
- Se esiste una unica implementazione di una interfaccia allora è giusto creare una classe scritta in questo modo:
    <nome della classe>Impl


Architetture
Model->Controller->Service->Repositoryù

Optional -> Oggetto di Schrödinger, finchè non apri la scatola non sai se l'oggetto esiste o no

Controller-> Intercettano le chiamate htttp e le smistano
Service -> possiedono tutta la logica di business


Server side e Client side rendering
- Client side -> vuol dire che una paginetta html sa renderizzarsi in autonomia, ha tutte le direttive necessarie(es cdn, collegamenti ecc ecc)
- Server side -> vuol dire che una paginetta html viene prima costruita(rederizzata) lato server e poi viene data al client

Template
- Sono pagine html dinamiche

Template engine
- Sono motori di template che ci aiutano nella costruzione di pagine dinamiche


<html xmlns:th="http://www.thymeleaf.org">
- Introduce quello che viene chiamato namespace
- Mappa su un prefisso th tutte le funzionalità di Thymeleaf


SPEL
- $ -> indica che stiamo manipolando una variabile
- @ -> indica che verrà manipolato un uri dinamico
- * -> E' un puntatore specifico verso qualcosa

Thymeleaf
- th:text -> indica che stiamo manipolandi dei testi
- th:each -> indica che stiamo utilizzando un foreach
- th:action -> indica che segue una costruzione di un uri dinamico
- th:object -> indica che stiamo per specificare un oggetto da manipoalre
- th:field -> indica che verrà collegato il valore indicato con un attributo specifico del model


DAO = MODEL

DTO -> Oggetti utilizzati per il trasferimento di dati seull'http
    -> Vengono poi trasformati negli oggetti reali presenti nel server e quindi vengono mappati
    -> Per poter essere mappati esistono vari modi tra cui l'utilizzo d una libreria chiamata model mapper