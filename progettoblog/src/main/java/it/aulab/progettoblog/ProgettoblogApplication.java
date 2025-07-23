package it.aulab.progettoblog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.aulab.progettoblog.utils.mappings.AuthorToAuthorDtoPropertyMap;

@SpringBootApplication
public class ProgettoblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoblogApplication.class, args);
	}

	@Bean
    //handler per istanziare l'oggetto modelMapper che mi fa il mapping
    public ModelMapper instanceModelMapper(){
        ModelMapper mapper = new ModelMapper();
        //Aggiungo un nuovo mapping che il mapper deve utilizzare
        //AuthorToAuthorDtoPropertyMap è presente all'interno del folde utils/mappings
        mapper.addMappings(new AuthorToAuthorDtoPropertyMap());
        // qui si aggiungono anche altri mappings se esistono
        return mapper;
    }

}
