package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.Comment;
import br.com.postmanagement.domain.repository.ICommentRepository;
import br.com.postmanagement.infra.db.mapper.CommentModelMapper;
import br.com.postmanagement.infra.db.model.CommentModel;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class CommentRepository implements ICommentRepository {


    @Override
    public Comment createComment(Comment comment) {
        var commentModel = CommentModelMapper.toModel(comment);
        commentModel.persist();
        return CommentModelMapper.toEntity(commentModel);
    }

    @Override
    public Comment updateComment(Comment comment) {
        var commentModel = CommentModelMapper.toModel(comment);
        commentModel.persistOrUpdate();
        return CommentModelMapper.toEntity(commentModel);
    }

    @Override
    public List<Comment> getAllCommentByPostId(Long postId) {
        return CommentModel.find("postId", postId).stream()
                .map(comment -> CommentModelMapper.toEntity((CommentModel) comment))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Comment> getCommentById(Long commentId) {
        return CommentModel.find("commentId", commentId).stream()
                .map(comment -> CommentModelMapper.toEntity((CommentModel) comment))
                .findFirst();
    }

    @Override
    public void deleteComment(Comment comment) {
        var commentModel = CommentModelMapper.toModel(comment);
        commentModel.delete();
    }
}
