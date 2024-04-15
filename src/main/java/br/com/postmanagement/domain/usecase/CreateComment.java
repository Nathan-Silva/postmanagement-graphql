package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.repository.ICommentRepository;

public class CreateComment {

    ICommentRepository commentRepository;


    public CreateComment(ICommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }


}
