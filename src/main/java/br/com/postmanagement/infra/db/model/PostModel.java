package br.com.postmanagement.infra.db.model;

import br.com.postmanagement.domain.entities.Comment;
import br.com.postmanagement.domain.entities.User;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@MongoEntity(collection = "Post")
public class PostModel extends PanacheMongoEntity {

    Long postId;

    User user;

    String imageId;

    String content;

    List<Comment> comments;

}
