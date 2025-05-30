package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
@Service
public class BookService {

//    @Autowired
//    private BookRepository bookRepository;
//
//    public Optional<Book> getBookById(Long id){
//       return bookRepository.findById(id);
//    }

    @Autowired
    private BookRepository bookRepository;

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public List<Book> getBooksByAuthor(String author){
        return bookRepository.findBookByAuthor(author);
    }

}
