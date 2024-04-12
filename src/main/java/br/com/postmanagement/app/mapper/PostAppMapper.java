package br.com.postmanagement.app.mapper;

import br.com.postmanagement.app.dto.CreatePostRequest;
import br.com.postmanagement.domain.entities.dto.PostDto;

public class PostAppMapper {

    public static PostDto toDto(CreatePostRequest createPostRequest){
        PostDto postDto = new PostDto();
        postDto.setUserId(createPostRequest.getUserId());
        postDto.setImageId(createPostRequest.getImageId());
        postDto.setContent(createPostRequest.getContent());

        return postDto;
    }
}
