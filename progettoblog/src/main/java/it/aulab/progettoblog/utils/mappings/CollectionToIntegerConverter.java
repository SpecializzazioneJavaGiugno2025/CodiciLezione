package it.aulab.progettoblog.utils.mappings;

import org.modelmapper.AbstractConverter;
import java.util.Collection;

//CollectionToIntegerConverter estende una classe AbstractConverter che riceve come parametri una collection riferita proprio alla collection da convertire, ed un intero che corrisponde al risultato finale della converisione.  AbstractConverter possiede proprio un metodo chiamato converter ,che andremo a sovrascrivere ,nel quale inseriamo le logiche di conversione da applicare.
public class CollectionToIntegerConverter extends AbstractConverter<Collection<?>, Integer> {

    //Converter riceve come parametro la collezione sulla quale deve applicare le logiche
    //Il metodo converter non viene richiamato da nessuna parte, noi semplicemente istanziamo l'oggeto CollectionToIntegerConverter dove ci serve (using(new CollectionToIntegerConverter())). Sarà il framework a capire cosa fare, nello specifico capirà nelle operazioni precedenti che deve recuperare una collezione, questa poi verrà utilizzata come parametro source di questo metodo
    //Altra magia da ramework
    @Override
    protected Integer convert(Collection<?> source) {
        //La conversione semplicemente ritorna il size(dimesione) della collection
        return source.size();
    }
    
}
