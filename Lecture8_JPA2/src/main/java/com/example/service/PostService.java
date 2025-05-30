package com.example.service;

import com.example.entity.Post;
import com.example.entity.PostComment;
import com.example.repository.PostCommentRepository;
import com.example.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final PostCommentRepository postCommentRepository;

    public PostService(PostRepository postRepository, PostCommentRepository postCommentRepository) {
        this.postRepository = postRepository;
        this.postCommentRepository = postCommentRepository;
    }

    // Get all posts before a certain date
    public List<Post> getPostsBeforeDate(LocalDate date) {
        return postRepository.findByDateBefore(date);
    }

    // Get all comments for a specific post after a given date
    public List<PostComment> getCommentsForPostAfterDate(Long postId, LocalDate date) {
        return postCommentRepository.findByPostIdAndDateAfter(postId, date);
    }

    // Get all posts containing specific text
    public List<Post> getPostsContainingText(String text) {
        return postRepository.findByTextContaining(text);
    }

    // Get all comments containing specific text
    public List<PostComment> getCommentsContainingText(String text) {
        return postCommentRepository.findByTextContaining(text);
    }

    // Save a new post
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    // Save a new comment
    public PostComment saveComment(PostComment comment) {
        return postCommentRepository.save(comment);
    }
}
