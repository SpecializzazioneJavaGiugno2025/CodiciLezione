package it.aulab.progettoblog.utils.mappings;

import org.modelmapper.PropertyMap;

import it.aulab.progettoblog.dtos.AuthorDto;
import it.aulab.progettoblog.models.Author;

// AuthorToAuthorDtoPropertyMap estende la classe PropertyMap che ha il compito di configurare le azioni di mappatura delle proprietà di un oggetto sorgente in quelle di un oggetto di destinazione, nel nostro caso dal DAO verso il DTO. Property map possiede proprio un metodo che andremo a sovrascrivere chiamato proprio "configure"
public class AuthorToAuthorDtoPropertyMap extends PropertyMap<Author, AuthorDto>{

    @Override
    protected void configure() {
        //Analizziamo questa sintassi
        //Using definisce che questa configurazione deve utilizzare qualcosa che successivamente verrà inviata al map
        //il risultato del converter verrà inviato come parametro al setNumberOfPosts del DTO, per questo inseriamo "null" poichè il risultato effettivo verrà calcolato dal converter e dato al metodo. E' una sintassi particolare da framework. Ma basta solo capire che, l'oggetto converter restituirà un valore, quel valore verrà inviato al metodo setNumberOfPosts che lo utilizzerà. Per poter attivare questa sintassi , ed il framework capire cosa fare, come parametro del metodo setNumberOfPosts bisogna inserire "null"
        //map prenderà il getPosts dal sorgente, questo è l'oggetto specificato come parametro a sinistra nelle parentesi angolari di PropertyMap (<Author, AuthorDto>). Il risultato del getPosts verrà dato in pasto al converter, il converter poi darà un risultato in output che verrà passato al setNumberOfPosts.
        //In pratica da source(Author) viene prelevata la collezione dei post collegati tramite relazione all'author, la collection viene data in pasto al converter, il converter darà in output un risultato che verrà dato al setNumberOfPosts del DTO
        //E' spudoratamente una sintanssi da framework
        using(new CollectionToIntegerConverter()).map(source.getPosts()).setNumberOfPosts(null);
    }
    
}
