package com.example.service;

import com.example.entity.Post;
import com.example.entity.PostComment;
import com.example.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(PostService postService, PostRepository postRepository){
        return args -> {
            Post post1 = new Post("post 1", LocalDate.of(2025, 04, 25), null);
            Post post2 = new Post("post 2", LocalDate.of(2025, 04, 01), null);

            postService.savePost(post1);
            postService.savePost(post2);


            List<PostComment> comments = List.of(
                    new PostComment("First comment of first post", LocalDate.of(2025, 04, 25), post1),
                    new PostComment("Second comment of first post", LocalDate.of(2025, 04, 26), post1),
                    new PostComment("First comment of second post", LocalDate.of(2025, 04, 05), post2),
                    new PostComment("Another comment of second post", LocalDate.of(2025, 04, 15), post2)
                    );

        postService.savePostComments(comments);

        List<PostComment> filteredComments = postService.getAllCommentsOfPostAfterDate(Long.parseLong("2"), LocalDate.of(2025, 02, 01));
        for (PostComment comment : filteredComments) {
            System.out.println(comment.getText());
        }

//            postRepository.findById(Long.parseLong("2")).ifPresent(post -> post.getComments().forEach(comment -> System.out.println(comment.getText())));
//          Post foundPost = postRepository.findById(Long.parseLong("2")).get();
//           for (PostComment c : foundPost.getComments()){
//               System.out.println(c.getText());
//           }

           postService.getAllCommentsOfPost(Long.parseLong("2")).forEach(comment -> System.out.println(comment.getText()));;
            postService.getAllCommentsOfPostAfterDate(Long.parseLong("2"), LocalDate.of(2025, 02, 01)).forEach(comment -> System.out.println(comment.getText()));
        };

    }

}
