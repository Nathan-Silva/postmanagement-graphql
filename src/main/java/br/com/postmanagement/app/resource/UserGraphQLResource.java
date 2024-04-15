package br.com.postmanagement.app.resource;

import br.com.postmanagement.app.dto.CreateUserRequest;
import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.service.UserService;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

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
    public UserDto getUserById(@Name("uuid") String uuid) {
        return userService.getUserById(uuid);
    }

    @Query
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
}