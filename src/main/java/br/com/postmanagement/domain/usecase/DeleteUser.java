package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.repository.IUserRepository;

import java.util.UUID;

public class DeleteUser {

    private final IUserRepository userRepository;

    public DeleteUser(IUserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void deleteUser(String uuid){
        var userExist = userRepository.getUserById(UUID.fromString(uuid));

        if(userExist.isEmpty())
            throw new RuntimeException("UUID invalido");

        userRepository.deleteUser(userExist.get());
    }
}
