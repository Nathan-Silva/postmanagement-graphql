package br.com.postmanagement.app.resource;

import br.com.postmanagement.app.dto.CreateUserRequest;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.service.UserService;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.*;

@GraphQLApi
public class UserGraphQLResource {

    @Inject
    UserService userService;

    @Mutation
    public UserDto createUser(CreateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }

    @Mutation
    public void deleteUser(String uuid) {
        userService.deleteUser(uuid);
    }


    @Query
    public String createUser(@Name("nome") String createUserRequest) {
        return createUserRequest;
    }
}