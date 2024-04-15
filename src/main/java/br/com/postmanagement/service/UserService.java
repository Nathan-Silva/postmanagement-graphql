package br.com.postmanagement.service;

import br.com.postmanagement.app.dto.CreateUserRequest;
import br.com.postmanagement.app.mapper.UserAppMapper;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.repository.IUserRepository;
import br.com.postmanagement.domain.usecase.CreateUser;
import br.com.postmanagement.domain.usecase.DeleteUser;
import br.com.postmanagement.domain.usecase.GetUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

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


    public UserDto getUserById(String uuid){
        var getUser = new GetUser(userRepository);
        return getUser.getUserById(UUID.fromString(uuid));
    }

    public List<UserDto> getAllUsers() {
        var getUser = new GetUser(userRepository);
        return getUser.getAllUsers();
    }
}
