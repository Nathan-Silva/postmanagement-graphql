package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.User;
import br.com.postmanagement.domain.repository.IUserRepository;
import br.com.postmanagement.infra.db.mapper.UserModelMapper;
import br.com.postmanagement.infra.db.model.UserModel;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class UserRepository implements IUserRepository {

    @Override
    public Optional<User> getUserByDocumentId(String documentId) {
        return UserModel.find("documentId", documentId)
                .stream().map(value -> UserModelMapper.toEntity((UserModel) value)).findFirst();
    }

    @Override
    public Optional<User> getUserById(UUID uuid) {
        return Optional.empty();
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
