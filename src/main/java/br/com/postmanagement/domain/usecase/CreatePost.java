package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.PostDto;
import br.com.postmanagement.domain.entities.mappers.PostMapper;
import br.com.postmanagement.domain.repository.IPostRepository;

public class CreatePost {

    IPostRepository postRepository;

    public CreatePost(IPostRepository postRepository){
        this.postRepository = postRepository;
    }

    public PostDto createPost(PostDto postDto){
        var postEntity = PostMapper.toEntity(postDto);
        return PostMapper.toDto(postRepository.createPost(postEntity));
    }
}
