package br.edu.ifsp.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.edu.ifsp.books.entities.Book;

@CrossOrigin
@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Integer>{

}
