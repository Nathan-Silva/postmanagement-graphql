package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.repository.IUserRepository;

public class UserUseCase {

    private IUserRepository userRepository;

    public UserUseCase(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

}
