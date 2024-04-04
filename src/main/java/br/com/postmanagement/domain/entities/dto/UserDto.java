package br.com.postmanagement.domain.entities.dto;

import br.com.postmanagement.domain.entities.Post;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record UserDto(
        UUID userId,
        String firstName,
        String lastName,
        String documentId,
        Integer age,
        LocalDateTime created,
        List<Post>posts) {
}
