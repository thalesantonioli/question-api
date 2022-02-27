package com.fiap.questionapi.exception;

import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
public class BusinessException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = -5658630135366125615L;

	private final List<String> parametros;

	public BusinessException(String message) {
		super(message);
		parametros = new ArrayList<>();
	}

	public BusinessException(String message, Throwable e) {
		super(message, e);
		parametros = new ArrayList<>();
	}

	public BusinessException(String message, List<String> params) {
		super(message);
		this.parametros = params;
	}

	public BusinessException(String message, Throwable e, List<String> params) {
		super(message, e);
		this.parametros = params;
	}

}
