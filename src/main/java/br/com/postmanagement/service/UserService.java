package br.com.postmanagement.service;

import br.com.postmanagement.app.dto.CreateUserRequest;
import br.com.postmanagement.app.mapper.UserAppMapper;
import br.com.postmanagement.domain.entities.User;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.repository.IUserRepository;
import br.com.postmanagement.domain.usecase.CreateUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
public class UserService {

    @Default
    IUserRepository userRepository;

    public UserDto createUser(CreateUserRequest createUserRequest){
        var createUser = new CreateUser(userRepository);

        return createUser.createUser(UserAppMapper.toDto(createUserRequest));
    }
}
