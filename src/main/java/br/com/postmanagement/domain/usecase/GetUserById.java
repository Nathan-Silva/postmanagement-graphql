package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.utils.exception.UseCaseException;
import br.com.postmanagement.domain.entities.mappers.UserMapper;
import br.com.postmanagement.domain.repository.IUserRepository;

import java.util.UUID;

public class GetUserById {

    private IUserRepository userRepository;

    public GetUserById(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto getUserById(UUID uuid){
        var user = userRepository.getUserById(uuid);

        if(user.isEmpty())
            throw new UseCaseException("01", "getUserById returns empty");

        return UserMapper.toDto(user.get());
    }
}
