package br.com.postmanagement.infra.db.model;

import br.com.postmanagement.domain.entities.Post;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.codecs.pojo.annotations.BsonId;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@MongoEntity(database = "db", collection = "User")
public class UserModel extends PanacheMongoEntityBase {

    @BsonId
    String userId;

    String firstName;

    String lastName;

    String documentId;

    Integer age;

    LocalDateTime created;

    List<Post> posts;
}
