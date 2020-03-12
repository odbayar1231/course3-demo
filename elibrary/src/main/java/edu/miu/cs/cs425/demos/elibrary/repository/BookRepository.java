package edu.miu.cs.cs425.demos.elibrary.repository;

import edu.miu.cs.cs425.demos.elibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
