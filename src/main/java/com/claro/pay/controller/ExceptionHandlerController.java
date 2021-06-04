package com.claro.pay.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.http.HttpStatus;

import com.claro.pay.enumaration.ExceptionEnum;
import com.claro.pay.exception.ErrorResponseException;

@Provider
public class ExceptionHandlerController implements ExceptionMapper<ErrorResponseException> {

	@Override
	public Response toResponse(ErrorResponseException exception) {
		return Response.status(HttpStatus.SC_INTERNAL_SERVER_ERROR)
				.entity(com.claro.pay.exception.Response.builder()
						.code(ExceptionEnum.INTERNAL_SERVER_ERROR.getId())
						.description(ExceptionEnum.INTERNAL_SERVER_ERROR.getDescription())
						.message(exception.getMessage())
						.build())
				.build();  
	}

}
