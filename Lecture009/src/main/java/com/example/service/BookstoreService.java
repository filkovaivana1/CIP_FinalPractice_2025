package com.example.service;

import com.example.entity.Book;
import com.example.entity.Bookstore;
import com.example.repository.BookRepository;
import com.example.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
@Service
public class BookstoreService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired BookstoreRepository bookstoreRepository;

    public List<Bookstore> getAllBookstores(){
        return bookstoreRepository.findAll();
    }

    public Optional<Bookstore> getBookstoreById(Long id){
        return bookstoreRepository.findById(id);
    }

    public Bookstore createBookstore(Bookstore bookstore){
        return bookstoreRepository.save(bookstore);
    }

    public Bookstore updateBookstore(Long bookstoreId, Bookstore bookstoreDetails){
        return bookstoreRepository.findById(bookstoreId).map(bookstore -> {
            bookstore.setName(bookstoreDetails.getName());
            bookstore.setAddress(bookstoreDetails.getAddress());
            return bookstoreRepository.save(bookstore);
        }).orElseThrow(()-> new RuntimeException("Bookstore not found"));
    }

    public void deleteBookstore(Long id){
        bookstoreRepository.findById(id).map(bookstore ->
        {
            bookstoreRepository.deleteById(id);
            return bookstore;
        }).orElseThrow(()-> new RuntimeException("Bookstore not found"));

    }

    public Bookstore addBookToBookstore(Long bookstoreId, Book book){
        return bookstoreRepository.findById(bookstoreId).map(
                bookstore -> {
                    bookstore.getBooks().add(book);
                    book.setBookstore(bookstore);
                    bookRepository.save(book);
                    return bookstoreRepository.save(bookstore);
                }
        ).orElseThrow(()-> new RuntimeException("Bookstore not found"));
    }

    public void deleteBookFromBookstore(Long bookstoreId, Long bookId){
        bookstoreRepository.findById(bookstoreId).ifPresent(
                bookstore -> {
                    bookRepository.findById(bookId).ifPresent(
                            book -> {
                                bookstore.getBooks().remove(book);
                                bookstoreRepository.save(bookstore);
                                bookRepository.delete(book);
                            }
                    );

                }
        );
    }

    public Optional<Bookstore> getBookstoreByBookId(Long bookId){
        return bookstoreRepository.findByBooks_Id(bookId);
    }

    public Optional<Bookstore> getBookstoreByBookName(String bookName){
        return bookstoreRepository.findByBooks_Name(bookName);
    }


    public Optional<Bookstore> getBookstoreByNameAndAddress(String name, String address){
        return bookstoreRepository.findByNameAndAddress(name, address);
    }
//    @Autowired
//    private BookstoreRepository bookstoreRepository;
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    public List<Bookstore> getAllBookstores(){
//       return bookstoreRepository.findAll();
//    }
//
//    public Optional<Bookstore> getBookstoreById(Long bookstoreId){
//        return bookstoreRepository.findById(bookstoreId);
//    }
//
//    public Bookstore createBookstore(Bookstore bookstore){
//        return bookstoreRepository.save(bookstore);
//    }
//
//    public Bookstore updateBookstore(Long bookstoreId, Bookstore bookstoreDetails){
//        return bookstoreRepository.findById(bookstoreId).map(bookstore -> {
//            bookstore.setName(bookstoreDetails.getName());
//            bookstore.setAddress(bookstoreDetails.getAddress());
//            return bookstoreRepository.save(bookstore);
//        }).orElseThrow(()-> new RuntimeException("Bookstore not found"));
//    }
//
//    public void deleteBookstore(Long id){
//        bookstoreRepository.deleteById(id);
//    }
//
//    public Bookstore addBookToBookstore(Long bookstoreId, Book book){
//        return bookstoreRepository.findById(bookstoreId).map(bookstore -> {
//            bookstore.getBooks().add(book);
//            book.setBookstore(bookstore);
//            bookRepository.save(book);
//           return bookstoreRepository.save(bookstore);
//        }).orElseThrow(()-> new RuntimeException("Bookstore not found"));
//    }
//
//    public void deleteBookFromBookstore(Long bookstoreId, Long bookId){
//        bookstoreRepository.findById(bookstoreId).ifPresent(bookstore -> {
//            Book foundBook = bookRepository.findById(bookId).get();
//            bookstore.getBooks().remove(foundBook);
//            bookstoreRepository.save(bookstore);
//            bookRepository.deleteById(bookId);
//        });
//    }
//
//    public Optional<Bookstore> getBookstoreByBookId(Long bookId) {
//        return bookstoreRepository.findByBooks_Id(bookId);
//    }
//
//    public Optional<Bookstore> getBookstoreByBooksName(String bookName) {
//        return bookstoreRepository.findByBooks_Name(bookName);
//    }
//
//    public Optional<Bookstore> getBookstoreByNameAndAddress(String name, String address) {
//        return bookstoreRepository.findByNameAndAddress(name, address);
//    }


}
