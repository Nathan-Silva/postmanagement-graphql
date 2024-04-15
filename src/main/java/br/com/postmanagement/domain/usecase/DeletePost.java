package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.entities.dto.PostDto;
import br.com.postmanagement.domain.entities.mappers.PostMapper;
import br.com.postmanagement.domain.repository.IPostRepository;

public class DeletePost {

    IPostRepository postRepository;

    public DeletePost(IPostRepository postRepository){
        this.postRepository = postRepository;
    }

    public PostDto deletePost(Long postId){
        return  null;
    }
}
