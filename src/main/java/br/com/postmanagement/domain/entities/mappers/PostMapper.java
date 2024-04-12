package br.com.postmanagement.domain.entities.mappers;

import br.com.postmanagement.domain.entities.Post;
import br.com.postmanagement.domain.entities.dto.PostDto;

public class PostMapper {

    public static PostDto toDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setUserId(postDto.getUserId());
        postDto.setPostId(post.getPostId());
        postDto.setContent(post.getContent());
        postDto.setImageId(postDto.getImageId());
        postDto.setComments(post.getComments());

        return postDto;
    }

    public static Post toEntity(PostDto postDto) {
        var post = new Post();
        post.setUserId(postDto.getUserId());
        post.setPostId(postDto.getPostId());
        post.setImageId(postDto.getImageId());
        post.setContent(postDto.getContent());
        post.setComments(postDto.getComments());
        return post;
    }

}
