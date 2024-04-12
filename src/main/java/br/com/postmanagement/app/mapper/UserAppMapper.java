package br.com.postmanagement.app.mapper;

import br.com.postmanagement.app.dto.CreateUserRequest;
import br.com.postmanagement.domain.entities.dto.UserDto;

public class UserAppMapper {

    public static UserDto toDto(CreateUserRequest createUserRequest) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(createUserRequest.getFirstName());
        userDto.setLastName(createUserRequest.getLastName());
        userDto.setDocumentId(createUserRequest.getDocumentId());
        userDto.setAge(createUserRequest.getAge());

        return userDto;
    }
}
