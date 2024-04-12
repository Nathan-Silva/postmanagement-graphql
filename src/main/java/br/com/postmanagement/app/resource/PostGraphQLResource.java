package br.com.postmanagement.app.resource;

import br.com.postmanagement.app.dto.CreatePostRequest;
import br.com.postmanagement.domain.entities.dto.PostDto;
import br.com.postmanagement.service.PostService;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;

@GraphQLApi
public class PostGraphQLResource {

    @Inject
    PostService postService;


    @Mutation
    public PostDto savePost(CreatePostRequest createPostRequest){
        return postService.savePost(createPostRequest);
    }

}
