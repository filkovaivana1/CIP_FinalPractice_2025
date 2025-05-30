package com.example.repository;

import com.example.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface BookstoreRepository extends JpaRepository<Bookstore, Long> {

    public Optional<Bookstore> findByName(String name);
    public Optional<Bookstore> findByAddress(String address);
    public Optional<Bookstore> findByNameAndAddress(String name, String address);

    public Optional<Bookstore> findByBooks_Id(Long bookId);
    public Optional<Bookstore> findByBooks_Name(String bookName);

}
