package br.com.postmanagement.infra.db.model;

import br.com.postmanagement.domain.entities.Comment;
import br.com.postmanagement.domain.entities.User;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@MongoEntity(database = "db", collection = "Post")
public class PostModel extends PanacheMongoEntityBase {

    @BsonId
    Long postId;

    String userId;

    String imageId;

    String content;

    List<Comment> comments;

}
