package br.com.postmanagement.domain.entities.enums;

public enum ErrorCodeEnum implements IEnum{

    USER_ALREADY_EXISTS("01", "User already exists", 400),
    USER_NOT_FOUND("02", "User not found", 404);
    private final String key;

    private final String error;

    private final int httpStatus;

    ErrorCodeEnum(String key, String error, int httpStatus){
        this.key = key;
        this.error = error;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getError() {
        return error;
    }

    @Override
    public int getHttpCode() {
        return httpStatus;
    }
}
