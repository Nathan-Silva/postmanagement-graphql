package br.com.postmanagement.infra.db.mapper;

import br.com.postmanagement.domain.entities.Comment;
import br.com.postmanagement.domain.entities.Post;
import br.com.postmanagement.infra.db.model.CommentModel;
import br.com.postmanagement.infra.db.model.PostModel;

public class CommentModelMapper {

    public static CommentModel toModel(Comment comment) {
        return CommentModel.builder()
                .commentId(comment.getCommentId())
                .comment(comment.getComment())
                .user(comment.getUser())
                .post(comment.getPost())
                .build();
    }

    public static Comment toEntity(CommentModel commentModel) {
        var comment = new Comment();
        comment.setCommentId(commentModel.getCommentId());
        comment.setUser(commentModel.getUser());
        comment.setComment(commentModel.getComment());
        comment.setPost(commentModel.getPost());
        return comment;
    }
}
