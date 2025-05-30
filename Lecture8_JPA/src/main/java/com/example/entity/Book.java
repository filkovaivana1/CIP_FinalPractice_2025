package com.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookstore_id")
//    @JsonManagedReference
    private Bookstore bookstore;

    public Bookstore getBookStore() {
        return bookstore;
    }

    public void setBookStore(Bookstore bookStore) {
        this.bookstore = bookStore;
    }

    public Book() {
    }

    public Book(Long id, String name, String author, Bookstore bookstore) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.bookstore = bookstore;
    }

    public Book(String name, String author, Bookstore bookstore) {
        this.name = name;
        this.author = author;
        this.bookstore = bookstore;
    }
    @Override
    public String toString(){
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", bookStore=" + bookstore.getName() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book )) return false;
        return id != null && id.equals(((Book) o).getId());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
