package br.com.postmanagement.domain.entities.mappers;

import br.com.postmanagement.domain.entities.dto.UserDto;
import br.com.postmanagement.domain.entities.User;

public class UserMapper {

        public static UserDto toDto(User user){
            return new UserDto(
                    user.getUserId(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getDocumentId(),
                    user.getAge(),
                    user.getCreated(),
                    user.getPosts()
            );
        }


        public static User toEntity(UserDto userDto){
            var user =  new User();
            user.setUserId(userDto.userId());
            user.setFirstName(userDto.firstName());
            user.setLastName(userDto.lastName());
            user.setAge(userDto.age());
            user.setDocumentId(userDto.documentId());
            user.setPosts(userDto.posts());

            return user;
        }


}
