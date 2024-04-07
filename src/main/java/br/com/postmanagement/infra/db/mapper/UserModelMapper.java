package br.com.postmanagement.infra.db.mapper;

import br.com.postmanagement.domain.entities.User;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.infra.db.model.UserModel;

import java.util.UUID;

public class UserModelMapper {

    public static UserModel toModel(User user){
        return UserModel.builder()
                .userId(user.getUserId().toString())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .documentId(user.getDocumentId())
                .age(user.getAge())
                .created(user.getCreated())
                .posts(user.getPosts())
                .build();
    }


    public static User toEntity(UserModel userModel){
        var user =  new User();
        user.setUserId(UUID.fromString(userModel.getUserId()));
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setAge(userModel.getAge());
        user.setDocumentId(userModel.getDocumentId());
        user.setPosts(userModel.getPosts());

        return user;
    }
}
