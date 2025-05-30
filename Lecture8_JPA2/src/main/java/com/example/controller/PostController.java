package com.example.controller;

import com.example.entity.Post;
import com.example.entity.PostComment;
import com.example.service.PostService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Get all posts before a certain date
    @GetMapping("/before/{date}")
    public List<Post> getPostsBeforeDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return postService.getPostsBeforeDate(date);
    }

    // Get all comments for a specific post after a certain date
    @GetMapping("/{postId}/comments/after/{date}")
    public List<PostComment> getCommentsForPostAfterDate(
            @PathVariable Long postId,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return postService.getCommentsForPostAfterDate(postId, date);
    }

    // Get all posts containing specific text
    @GetMapping("/search")
    public List<Post> getPostsContainingText(@RequestParam String text) {
        return postService.getPostsContainingText(text);
    }

    // Get all comments containing specific text
    @GetMapping("/comments/search")
    public List<PostComment> getCommentsContainingText(@RequestParam String text) {
        return postService.getCommentsContainingText(text);
    }

    // Create a new post
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    // Create a new comment for a post
    @PostMapping("/{postId}/comments")
    public PostComment createComment(@PathVariable Long postId, @RequestBody PostComment comment) {
        Post post = new Post();
        post.setId(postId);
        comment.setPost(post);
        return postService.saveComment(comment);
    }
}
