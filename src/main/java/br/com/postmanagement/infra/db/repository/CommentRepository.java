package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.Comment;
import br.com.postmanagement.domain.repository.ICommentRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CommentRepository implements ICommentRepository {


    @Override
    public Comment createComment(Comment comment) {
        return null;
    }

    @Override
    public Comment updateComment(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> getAllCommentByPostId(Long postId) {
        return null;
    }

    @Override
    public Comment getCommentById(Long commentId) {
        return null;
    }

    @Override
    public void deleteComment(Comment comment) {

    }
}
