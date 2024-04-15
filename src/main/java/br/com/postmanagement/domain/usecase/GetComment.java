package br.com.postmanagement.domain.usecase;

import br.com.postmanagement.domain.repository.ICommentRepository;

public class GetComment {

    ICommentRepository commentRepository;


    public GetComment(ICommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }


}
