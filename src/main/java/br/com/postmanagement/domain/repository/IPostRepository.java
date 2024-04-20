package br.com.postmanagement.domain.repository;

import br.com.postmanagement.domain.entities.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPostRepository {

    Post createPost(Post post);

    Post updatePost(Post post);

    List<Post> getAllPostByUserId(UUID uuid);

    Optional<Post> getPostByUserId(UUID uuid);

    void deletePost(Post post);

}
