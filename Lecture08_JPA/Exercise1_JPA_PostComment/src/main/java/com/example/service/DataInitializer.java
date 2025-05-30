package com.example.service;

import com.example.entity.Post;
import com.example.entity.PostComment;
import com.example.repository.PostCommentRepository;
import com.example.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

//@Configuration

@Configuration
public class DataInitializer {

//    @Bean
//    CommandLineRunner initDatabase(PostRepository postRepository, PostCommentRepository postCommentRepository) {
//        return args -> {
//            Post post1 = new Post("First post", LocalDate.of(2025, 04, 15), null);
//            Post post2 = new Post("Second post", LocalDate.of(2025, 04, 17), null);
//
//            postRepository.save(post1);
//            postRepository.save(post2);
//
//            List<PostComment> comments = List.of(
//                    new PostComment("First comment for first post", LocalDate.of(2025, 04, 15), post1),
//                    new PostComment("Second comment for first post", LocalDate.of(2025, 04, 16), post1),
//                    new PostComment("First comment for second post", LocalDate.of(2025, 04, 17), post2),
//                    new PostComment("Another comment for second post", LocalDate.of(2025, 04, 19), post2));
//
//            postCommentRepository.saveAll(comments);
//
//            post1.setComments(List.of(comments.get(0), comments.get(1)));
//            post2.setComments(List.of(comments.get(2), comments.get(3)));
//
//            postRepository.save(post1);
//            postRepository.save(post2);
//
//            postRepository.findById(Long.parseLong("2")).ifPresent(post -> {
//                post.getComments().forEach(comment -> System.out.println(comment.getText()));
//
//            });
//
//        };
//
//    }

}
