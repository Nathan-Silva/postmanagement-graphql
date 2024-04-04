package br.com.postmanagement.domain.repository;


import br.com.postmanagement.domain.entity.User;

public interface IUserRepository {

    User getUserById(Long userId);

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(User user);
}
