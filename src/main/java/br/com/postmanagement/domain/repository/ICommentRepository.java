package br.com.postmanagement.domain.repository;

import br.com.postmanagement.domain.entity.Comment;

import java.util.List;

public interface ICommentRepository {

    Comment createComment(Comment comment);

    Comment updateComment(Comment comment);

    List<Comment> getAllCommentByPostId(Long postId);

    Comment getCommentById(Long commentId);

    void deleteComment(Comment comment);
}
