package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.User;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.entities.enums.ErrorCodeEnum;
import br.com.postmanagement.domain.utils.exception.UseCaseException;
import br.com.postmanagement.domain.entities.mappers.UserMapper;
import br.com.postmanagement.domain.repository.IUserRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public List<UserDto> getAllUsers(){
        List<User> allUsers = userRepository.getAllUsers();
        return allUsers.stream().map(UserMapper::toDto).collect(Collectors.toList());
    }
}
