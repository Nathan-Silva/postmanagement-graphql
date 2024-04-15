package br.com.postmanagement.app.dto;

import lombok.Data;

@Data
public class CreatePostRequest {

    String userId;

    String imageId;

    String content;

}
