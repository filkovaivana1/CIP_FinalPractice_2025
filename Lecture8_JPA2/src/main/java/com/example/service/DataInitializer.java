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

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(PostRepository postRepository, PostCommentRepository postCommentRepository) {
        return args -> {
            // Creating Posts
            Post post1 = new Post(null, "First Post", LocalDate.of(2024, 3, 1), null);
            Post post2 = new Post(null, "Second Post with more content", LocalDate.of(2024, 3, 5), null);

            post1 = postRepository.save(post1);
            post2 = postRepository.save(post2);

            // Creating Comments
            List<PostComment> comments = List.of(
                    new PostComment(null, "First comment on first post", LocalDate.of(2024, 3, 2), post1),
                    new PostComment(null, "Second comment on first post", LocalDate.of(2024, 3, 3), post1),
                    new PostComment(null, "Third comment on second post", LocalDate.of(2024, 3, 6), post2),
                    new PostComment(null, "Another comment on second post", LocalDate.of(2024, 3, 7), post2),
                    new PostComment(null, "Final comment on second post", LocalDate.of(2024, 3, 8), post2)
            );

            postCommentRepository.saveAll(comments);
        };
    }
}