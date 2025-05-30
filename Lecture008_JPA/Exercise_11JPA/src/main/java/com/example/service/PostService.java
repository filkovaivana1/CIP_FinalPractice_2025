package com.example.service;

import com.example.entity.Post;
import com.example.entity.PostComment;
import com.example.repository.PostCommentRepository;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostCommentRepository postCommentRepository;

    public List<Post> getAllPostsBeforeDate(LocalDate date){
        return postRepository.findByDateBefore(date);
    }

    public List<Post> getAllPostsContainingText(String keyword){
        return postRepository.findByTextContaining(keyword);
    }


    public List<PostComment> getAllCommentsOfPostAfterDate(Long postId, LocalDate date){
        return postCommentRepository.findByPostIdAndDateAfter(postId, date);
    }

    public List<PostComment> getAllCommentsOfPost(Long postId){
        return postCommentRepository.findByPostId(postId);
    }

    public List<PostComment> getAllCommentsContainingText(String keyword){
        return postCommentRepository.findByTextContaining(keyword);
    }

    public Post savePost(Post post){
       return postRepository.save(post);
    }
    public PostComment savePostComment(PostComment postComment){
        return postCommentRepository.save(postComment);
    }

    public List<PostComment> savePostComments(List<PostComment> postComments){
        return postCommentRepository.saveAll(postComments);
    }

}
