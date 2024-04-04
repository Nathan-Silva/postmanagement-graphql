package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.entities.mappers.UserMapper;
import br.com.postmanagement.domain.repository.IUserRepository;

import java.time.LocalDateTime;

public class CreateUser {

    private IUserRepository userRepository;

    public CreateUser(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto){
        verifyIfUserExists(userDto.documentId());

        var userEntity = UserMapper.toEntity(userDto);
        userEntity.setCreated(LocalDateTime.now());

        var user = userRepository.saveUser(userEntity);

        return UserMapper.toDto(user);
    }


    private void verifyIfUserExists(String documentId){
    }
}
