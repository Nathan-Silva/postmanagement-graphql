package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.entities.enums.ErrorCodeEnum;
import br.com.postmanagement.domain.utils.exception.UseCaseException;
import br.com.postmanagement.domain.entities.mappers.UserMapper;
import br.com.postmanagement.domain.repository.IUserRepository;

import java.util.UUID;

public class GetUser {

    private IUserRepository userRepository;

    public GetUser(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto getUserById(UUID uuid){
        var user = userRepository.getUserById(uuid);

        if(user.isEmpty())
            throw new UseCaseException(ErrorCodeEnum.USER_NOT_FOUND);

        return UserMapper.toDto(user.get());
    }
}
