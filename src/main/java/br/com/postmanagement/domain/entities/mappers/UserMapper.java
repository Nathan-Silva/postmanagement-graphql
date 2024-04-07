package br.com.postmanagement.domain.entities.mappers;

import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.entities.User;

public class UserMapper {

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setDocumentId(user.getDocumentId());
        userDto.setAge(user.getAge());
        userDto.setCreated(user.getCreated());
        userDto.setPosts(user.getPosts());

        return userDto;
    }


    public static User toEntity(UserDto userDto) {
        var user = new User();
        user.setUserId(userDto.getUserId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setAge(userDto.getAge());
        user.setDocumentId(userDto.getDocumentId());
        user.setPosts(userDto.getPosts());

        return user;
    }


}
