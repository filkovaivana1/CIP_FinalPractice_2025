package com.example.service;

import com.example.entity.Book;
import com.example.entity.Bookstore;
import com.example.repository.BookRepository;
import com.example.repository.BookstoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner dataInitialize(BookRepository bookRepository, BookstoreRepository bookstoreRepository){
        return args -> {


            var savedBookStore = bookstoreRepository.saveAll(List.of(new Bookstore("First store", "Address1"),
                    new Bookstore("Second store", "Adress2"),
                    new Bookstore("Third store", "Adress2")));

            var savedBooks = bookRepository.saveAll(List.of(new Book("Book1", "Author1", savedBookStore.get(0)),
                    new Book("Book 2", "Author 2", savedBookStore.get(1)),
                    new Book("Book 3", "Author 3", savedBookStore.get(0)),
                    new Book("Book 4", "Author 4", savedBookStore.get(1))

                    ));
            savedBookStore.get(0).getBooks().add(savedBooks.get(0));
            savedBookStore.get(0).getBooks().add(savedBooks.get(2));
            savedBookStore.get(1).getBooks().add(savedBooks.get(1));
            savedBookStore.get(1).getBooks().add(savedBooks.get(3));

            bookstoreRepository.saveAll(savedBookStore);
        };
    }
}
