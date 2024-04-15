package br.com.postmanagement.app.exception;

import br.com.postmanagement.domain.utils.exception.UseCaseException;
import br.com.postmanagement.domain.utils.exception.UseCaseExceptionResponseDto;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class ExceptionMapperResponse implements ExceptionMapper<UseCaseException> {
    @Override
    public Response toResponse(UseCaseException e) {

        var useCaseExceptionDto = new UseCaseExceptionResponseDto();
        useCaseExceptionDto.setMessage(e.getMessage());
        useCaseExceptionDto.setErrorCode(e.getErrorCode());

        return Response.status(Integer.parseInt(e.getErrorCode())).entity(useCaseExceptionDto).build();
    }
}
