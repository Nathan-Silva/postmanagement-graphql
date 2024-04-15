package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.repository.ICommentRepository;

public class DeleteComment {

    ICommentRepository commentRepository;


    public DeleteComment(ICommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }


}
