package com.example.service;

import com.example.entity.Post;
import com.example.entity.PostComment;
import com.example.repository.PostCommentRepository;
import com.example.repository.PostRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//@Service
public class PostService {

//    @Autowired
//    private PostRepository postRepository;
//
//    @Autowired
//    private PostCommentRepository postCommentRepository;
//
//
//    public List<Post> getPostsBeforeDate(LocalDate date) {
//        return postRepository.findByDateBefore(date);
//    }
//
//    public List<PostComment> getCommentsForPostAfterDate(Long postId, LocalDate date){
//        return postCommentRepository.findByPostIdAndDateAfter(postId, date);
//    }
//
//    public List<Post> getPostsContainingText(String text){
//        return postRepository.findByTextContaining(text);
//    }
//
//    public List<PostComment> getCommentsContainingText(String text){
//        return postCommentRepository.findByTextContaining(text);
//    }
//
//    public Post savePost(Post post){
//       return postRepository.save(post);
//    }
//
//    public PostComment saveComment(PostComment postComment){
//        return postCommentRepository.save(postComment);
//    }

}
