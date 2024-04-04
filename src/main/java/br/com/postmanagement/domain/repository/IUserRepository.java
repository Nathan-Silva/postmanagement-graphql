package br.com.postmanagement.domain.repository;


import br.com.postmanagement.domain.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {

    Optional<User> getUserById(UUID userId);

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(User user);
}
