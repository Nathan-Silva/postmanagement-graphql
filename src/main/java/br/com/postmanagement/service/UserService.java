package br.com.postmanagement.service;

import br.com.postmanagement.app.dto.CreateUserRequest;
import br.com.postmanagement.app.mapper.UserAppMapper;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.repository.IUserRepository;
import br.com.postmanagement.domain.usecase.CreateUser;
import br.com.postmanagement.domain.usecase.DeleteUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {

    @Inject
    IUserRepository userRepository;

    public UserDto createUser(CreateUserRequest createUserRequest){
        var createUser = new CreateUser(userRepository);

        return createUser.createUser(UserAppMapper.toDto(createUserRequest));
    }

    public void deleteUser(String uuid){
        var deleteUser = new DeleteUser(userRepository);
        deleteUser.deleteUser(uuid);
    }

}
