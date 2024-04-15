package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.entities.enums.ErrorCodeEnum;
import br.com.postmanagement.domain.entities.mappers.UserMapper;
import br.com.postmanagement.domain.repository.IUserRepository;
import br.com.postmanagement.domain.utils.exception.UseCaseException;

import java.time.LocalDateTime;
import java.util.UUID;

public class CreateUser {

    private final IUserRepository userRepository;

    public CreateUser(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto){
        verifyIfUserExists(userDto.getDocumentId());

        var userEntity = UserMapper.toEntity(userDto);
        userEntity.setUserId(UUID.randomUUID());
        userEntity.setCreated(LocalDateTime.now());

        var user = userRepository.saveUser(userEntity);

        return UserMapper.toDto(user);
    }


    private void verifyIfUserExists(String documentId){
        var userExist = userRepository.getUserByDocumentId(documentId);

        if(userExist.isPresent())
            throw new UseCaseException(ErrorCodeEnum.USER_ALREADY_EXISTS);
    }
}
