package br.com.postmanagement.domain.entities.enums;

public enum ErrorCodeEnum implements IEnum{
;
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
