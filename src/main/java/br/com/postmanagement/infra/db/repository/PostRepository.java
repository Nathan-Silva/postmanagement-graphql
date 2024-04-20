package br.com.postmanagement.infra.db.repository;

import br.com.postmanagement.domain.entities.Post;
import br.com.postmanagement.domain.repository.IPostRepository;
import br.com.postmanagement.infra.db.mapper.PostModelMapper;
import br.com.postmanagement.infra.db.model.PostModel;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@ApplicationScoped
public class PostRepository implements IPostRepository {
    @Override
    public Post createPost(Post post) {
        var postModel = PostModelMapper.toModel(post);
        postModel.persist();

        return PostModelMapper.toEntity(postModel);
    }

    @Override
    public Post updatePost(Post post) {
        var postModel = PostModelMapper.toModel(post);
        postModel.persistOrUpdate();
        return PostModelMapper.toEntity(postModel);
    }

    @Override
    public List<Post> getAllPostByUserId(UUID uuid) {
        return PostModel.find("userId", uuid).stream()
                .map(post -> PostModelMapper.toEntity((PostModel) post))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Post> getPostByUserId(UUID uuid) {
        return PostModel.find("userId", uuid).stream()
                .map(post -> PostModelMapper.toEntity((PostModel) post))
                .findFirst();
    }

    @Override
    public void deletePost(Post post) {
        var postModel = PostModelMapper.toModel(post);
        postModel.delete();
    }
}
