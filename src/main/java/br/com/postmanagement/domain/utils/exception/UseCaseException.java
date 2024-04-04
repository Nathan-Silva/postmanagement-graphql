package br.com.postmanagement.domain.utils.exception;

import br.com.postmanagement.domain.entities.enums.ErrorCodeEnum;

public class UseCaseException extends RuntimeException{

    private String errorCode = "-1";

    public UseCaseException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public UseCaseException(ErrorCodeEnum errorCodeEnum){
        super(errorCodeEnum.getError());
        this.errorCode = errorCodeEnum.getError();
    }

    public String getErrorCode() {
        return errorCode;
    }
}
