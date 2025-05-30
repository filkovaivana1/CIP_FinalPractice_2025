package com.example.model;

public class Book {

  private String title;
  private String author;

  private boolean reserved;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.reserved = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titie) {
        this.title = titie;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    //    private String title;
//    private String author;
//    private boolean reserved;
//
//    // Constructor
//    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//        this.reserved = false;
//    }
//
//    // Getters and Setters
//    public String getTitle() { return title; }
//    public String getAuthor() { return author; }
//    public boolean isReserved() { return reserved; }
//    public void setReserved(boolean reserved) { this.reserved = reserved; }
}