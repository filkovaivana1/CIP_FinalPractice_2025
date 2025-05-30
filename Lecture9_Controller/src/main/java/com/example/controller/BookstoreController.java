package com.example.controller;

import com.example.entity.Book;
import com.example.entity.Bookstore;
import com.example.service.BookService;
import com.example.service.BookstoreService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookstores")
//@RequiredArgsConstructor
public class BookstoreController {

    private Logger logger = LoggerFactory.getLogger(BookstoreController.class);
    @Autowired
    private BookstoreService bookstoreService;

    @Autowired BookService bookService;

    @GetMapping("/byBookId/{id}")
    public Bookstore getBookstoreByBookId(@PathVariable Long id) {
        logger.info("Get bookstore by book id");
        return bookstoreService.getBookstoreByBookId(id).get();
    }

//    @GetMapping("/byBookId/{id}")
//    public Optional<Bookstore> getBookstoreByBookId(@PathVariable Long id) {
//        logger.info("Get book store by book id");
//        return bookStoreService.getBookstoreByBookId(id);
//    }


    @GetMapping("/byBookName/{name}")
    public Bookstore getBookstoreByBooksName(@PathVariable String name){
        return bookstoreService.getBookstoreByBooksName(name).get();
    }

//    @GetMapping("/byBookName/{name}")
//    public Optional<Bookstore> getBookStoreByBooksName(@PathVariable String name) {
//        logger.info("Get book store by book name");
//        return bookStoreService.getBookstoreByBooksName(name);
//    }

    @GetMapping
    public List<Bookstore> getAllBookstores(){
       return bookstoreService.getAllBookstores();
    }

//    @GetMapping
//    public List<Bookstore> getAllBookStores() {
//        return bookStoreService.getAllBookstores();
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Bookstore> getBookStoreById(@PathVariable Long id) {
//        Optional<Bookstore> bookStore = bookStoreService.getBookstoreById(id);
//        return bookStore.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }


    @GetMapping("/{id}")
    public Bookstore getBookstoreById(@PathVariable Long id){
        return bookstoreService.getBookstoreById(id);
    }

//    @GetMapping("/{id}")
//    public Bookstore getBookStoreById(@PathVariable Long id) {
//        return bookStoreService.getBookstoreById(id);
//       }


    @PostMapping("/addBook")
    public Bookstore createBookstore(@RequestBody Bookstore bookstore){
        return bookstoreService.createBookstore(bookstore);
    }

//    @PostMapping(value="/addBook"
//    )
//    public Bookstore createBookStore(@RequestBody Bookstore bookStore) {
//        System.out.println("Here");
//        return bookStoreService.createBookstore(bookStore);
//    }

    @PutMapping("/{id}")
    public Bookstore updateBookstore(@PathVariable Long id, @RequestBody Bookstore bookstore)
    {
        return bookstoreService.updateBookstore(id, bookstore);
    }
//    @PutMapping("/{id}")
//    public ResponseEntity<Bookstore> updateBookStore(@PathVariable Long id, @RequestBody Bookstore bookStore) {
//        try {
//            return ResponseEntity.ok(bookStoreService.updateBookstore(id, bookStore));
//        } catch (RuntimeException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @DeleteMapping("/{id}")
    public void deleteBookstore(@PathVariable Long id){
        bookstoreService.deleteBookstore(id);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBookStore(@PathVariable Long id) {
//        bookStoreService.deleteBookstore(id);
//        return ResponseEntity.noContent().build();
//    }

    @PostMapping("/{bookStoreId}/books")
    public Bookstore addBookToBookstore(@PathVariable Long bookStoreId, @RequestBody Book book)
    {
        return bookstoreService.addBookToBookstore(bookStoreId, book);
    }

//    @PostMapping("/{bookStoreId}/books")
//    public ResponseEntity<Bookstore> addBookToBookStore(@PathVariable Long bookStoreId, @RequestBody Book book) {
//        try {
//            return ResponseEntity.ok(bookStoreService.addBookToBookstore(bookStoreId, book));
//        } catch (RuntimeException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @PostMapping(value = "/{bookStoreId}/{bookId}/books")
    public Bookstore addExistingBookToBookstore(@PathVariable Long bookStoreId, @PathVariable long bookId){
       Book book = bookService.getBookById(bookId);
        return bookstoreService.addBookToBookstore(bookStoreId, book);
    }

//    @PostMapping(value="/{bookStoreId}/{bookId}/books")
//    public ResponseEntity<Bookstore> addExistingBookToBookStore(@PathVariable Long bookStoreId, @PathVariable Long bookId) {
//        try {
//            Book book = bookService.getBookById(bookId);
//            return ResponseEntity.ok(bookStoreService.addBookToBookstore(bookStoreId, book));
//
//        } catch (RuntimeException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @DeleteMapping("/{bookStoreId}/books/{bookId}")
    public void removeBookFromBookstore(@PathVariable Long bookStoreId, @PathVariable Long bookId){
        bookstoreService.removeBookFromBookstore(bookStoreId, bookId);
    }

//    @DeleteMapping("/{bookStoreId}/books/{bookId}")
//    public ResponseEntity<Void> removeBookFromBookStore(@PathVariable Long bookStoreId, @PathVariable Long bookId) {
//        bookStoreService.removeBookFromBookstore(bookStoreId, bookId);
//        return ResponseEntity.noContent().build();
//    }

}
