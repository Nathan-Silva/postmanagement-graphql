package br.com.postmanagement.app.dto;

import br.com.postmanagement.domain.entities.User;
import lombok.Data;

@Data
public class CreatePostRequest {

    String userId;

    String imageId;

    String content;

}
