package br.com.postmanagement.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateUserRequest {

    String firstName;

    String lastName;

    String documentId;

    Integer age;
}
