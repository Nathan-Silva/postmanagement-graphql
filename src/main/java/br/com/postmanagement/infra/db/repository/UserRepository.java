package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.User;
import br.com.postmanagement.domain.repository.IUserRepository;

import java.util.Optional;
import java.util.UUID;

public class UserRepository implements IUserRepository {

    @Override
    public Optional<User> getUserById(UUID uuid) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }
}
