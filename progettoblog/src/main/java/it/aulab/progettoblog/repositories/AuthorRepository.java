package it.aulab.progettoblog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import it.aulab.progettoblog.models.Author;

public interface AuthorRepository extends ListCrudRepository<Author,Long>{
    //derived query
    //select * from authors where firstname = name
    List<Author> findByName(String firstname);
    List<Author> findBySurname(String lastname);
    //select * from authors where firstname = name and lastname = surname
    List<Author> findByNameAndSurname(String firstname, String lastname);

    //query native
    @Query(value = "SELECT * FROM authors a WHERE a.firstname = 'Giuseppe'", nativeQuery = true)
    List<Author> authorsWithSpecifiedName();

    //query non native, sono query che sfruttano l'oop ed i modelli al 100%
    @Query(value = "SELECT a FROM Author a WHERE a.name= 'Giuseppe'")
    List<Author> authorsWithSpecifiedNameNonNative();

    // @Query(value = "SELECT * FROM authors a WHERE a.firstname = :name", nativeQuery = true)
    // List<Author> authorsWithSpecifiedName(@Param("name") String name);

    // @Query("SELECT a FROM Author a WHERE a.name = :name")
    // List<Author> authorsWithSpecifiedNameNonNative(@Param("name") String name);
}
