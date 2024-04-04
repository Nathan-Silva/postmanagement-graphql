package br.com.postmanagement.infra.db.model;

import br.com.postmanagement.domain.entity.Post;
import br.com.postmanagement.domain.entity.User;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@MongoEntity(collection = "Comment")
public class CommentModel extends PanacheMongoEntity {

    Long commentId;

    User user;

    String comment;

    Post post;

}
