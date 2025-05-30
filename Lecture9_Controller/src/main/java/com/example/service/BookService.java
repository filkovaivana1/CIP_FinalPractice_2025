package com.example.service;

import com.example.entity.Book;
import com.example.entity.Bookstore;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service
//@Transactional
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

//    public List<Book> getBooksByBookstore(Bookstore bookStore) {
//        return bookRepository.findBookByBookstore(bookStore);
//    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }


    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findBookByAuthor(author);
    }

}
