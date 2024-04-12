package br.com.postmanagement.infra.db.model;

import br.com.postmanagement.domain.entities.Post;
import br.com.postmanagement.domain.entities.User;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.codecs.pojo.annotations.BsonId;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@MongoEntity(database = "db", collection = "Comment")
public class CommentModel extends PanacheMongoEntityBase {

    @BsonId
    Long commentId;

    User user;

    String comment;

    Post post;

}
