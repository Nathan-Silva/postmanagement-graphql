package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.PostDto;
import br.com.postmanagement.domain.repository.IPostRepository;

import java.util.List;

public class GetPost {

    IPostRepository postRepository;

    public GetPost(IPostRepository postRepository){
        this.postRepository = postRepository;
    }

    public List<PostDto> getAllPostsByUsers(String uuid){
        return  null;
    }


    public PostDto getPostById(Long postId){
        return null;
    }
}
