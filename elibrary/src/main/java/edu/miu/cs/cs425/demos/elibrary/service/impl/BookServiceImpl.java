package edu.miu.cs.cs425.demos.elibrary.service.impl;

import edu.miu.cs.cs425.demos.elibrary.model.Book;
import edu.miu.cs.cs425.demos.elibrary.repository.BookRepository;
import edu.miu.cs.cs425.demos.elibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
