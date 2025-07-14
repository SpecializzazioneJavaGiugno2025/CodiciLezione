package it.aulab.progettoblog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.aulab.progettoblog.models.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{
    //derived query
    //select * from authors where firstname = name
    List<Author> findByName(String firstname);
    List<Author> findBySurname(String lastname);
    //select * from authors where firstname = name and lastname = surname
    List<Author> findByNameAndSurname(String firstname, String lastname);

    //query native
    @Query(value = "SELECT * FROM authors a WHERE a.firstname = 'Giuseppe'", nativeQuery = true)
    List<Author> authorsWithName();

    //query non native, sono query che sfruttano l'oop ed i modelli al 100%
    @Query(value = "SELECT a FROM Author a WHERE a.name= 'Giuseppe'")
    List<Author> authorsWithNameNonNative();

}
