package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.Post;
import br.com.postmanagement.domain.repository.IPostRepository;

import java.util.List;
import java.util.UUID;

public class PostRepository implements IPostRepository {
    @Override
    public Post createPost(Post post) {
        return null;
    }

    @Override
    public Post updatePost(Post post) {
        return null;
    }

    @Override
    public List<Post> getAllPostByUserId(UUID uuid) {
        return null;
    }

    @Override
    public Post getPostByUserId(UUID uuid) {
        return null;
    }

    @Override
    public void deletePost(Post post) {

    }
}
