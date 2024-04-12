package br.com.postmanagement.infra.db.mapper;

import br.com.postmanagement.domain.entities.Post;
import br.com.postmanagement.infra.db.model.PostModel;

public class PostModelMapper {

    public static PostModel toModel(Post post) {
        return PostModel.builder()
                .postId(post.getPostId())
                .userId(post.getUserId())
                .imageId(post.getImageId())
                .content(post.getContent())
                .comments(post.getComments())
                .build();
    }

    public static Post toEntity(PostModel postModel) {
        var post = new Post();
        post.setUserId(postModel.getUserId());
        post.setPostId(postModel.getPostId());
        post.setImageId(postModel.getImageId());
        post.setContent(postModel.getContent());
        post.setComments(postModel.getComments());
        return post;
    }
}
