package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.User;
import br.com.postmanagement.domain.repository.IUserRepository;
import br.com.postmanagement.infra.db.mapper.UserModelMapper;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class UserRepository implements IUserRepository {

    @Override
    public Optional<User> getUserById(UUID uuid) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        var userModel = UserModelMapper.toModel(user);
        userModel.persist();

        return UserModelMapper.toEntity(userModel);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {
        var userModel = UserModelMapper.toModel(user);
        userModel.delete();
    }
}
