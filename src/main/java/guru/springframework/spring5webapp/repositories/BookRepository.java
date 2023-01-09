package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Book;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.repository.CrudRepository;

import java.nio.file.LinkOption;

public interface BookRepository extends CrudRepository<Book, Long> {
}
