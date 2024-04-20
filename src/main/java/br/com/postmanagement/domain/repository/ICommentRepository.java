package br.com.postmanagement.domain.repository;

import br.com.postmanagement.domain.entities.Comment;

import java.util.List;
import java.util.Optional;

public interface ICommentRepository {

    Comment createComment(Comment comment);

    Comment updateComment(Comment comment);

    List<Comment> getAllCommentByPostId(Long postId);

    Optional<Comment> getCommentById(Long commentId);

    void deleteComment(Comment comment);
}
