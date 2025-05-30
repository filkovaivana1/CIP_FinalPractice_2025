package com.example.entity;

import com.example.repository.PostRepository;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private LocalDate date;

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<PostComment> comments;



//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String text;
//
//    private LocalDate date;
//
//    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<PostComment> comments;
//
//    public Post() {
//    }
//
//    public Post(String text, LocalDate date, List<PostComment> comments) {
//        this.text = text;
//        this.date = date;
//        this.comments = comments;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public List<PostComment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<PostComment> comments) {
//        this.comments = comments;
//    }




}
