package br.com.postmanagement.infra.db.model;

import br.com.postmanagement.domain.entity.Post;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@MongoEntity(collection = "User")
public class UserModel extends PanacheMongoEntity {

    UUID userId;

    String firstName;

    String lastName;

    String documentId;

    Integer age;

    LocalDateTime created;

    List<Post> posts;
}
