package br.com.postmanagement.service;

import br.com.postmanagement.app.dto.CreatePostRequest;
import br.com.postmanagement.app.mapper.PostAppMapper;
import br.com.postmanagement.domain.entities.dto.PostDto;
import br.com.postmanagement.domain.repository.IPostRepository;
import br.com.postmanagement.domain.usecase.CreatePost;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PostService {

    @Inject
    IPostRepository postRepository;

    public PostDto savePost(CreatePostRequest createPostRequest){
        var postCreate = new CreatePost(postRepository);
        return postCreate.createPost(PostAppMapper.toDto(createPostRequest));
    }


    public List<PostDto> getAllPostsByUsers(String uuid){
        return null;
    }

    public PostDto getPostById(Long postId){
        return null;
    }

    public void deletePost(Long postId){
        return;
    }
}
