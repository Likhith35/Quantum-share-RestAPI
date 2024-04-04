package com.quantum_paradigm.socialshare.exception;

import lombok.Data;

@Data
public class ClientException extends RuntimeException {
	String message;

	public ClientException(String message) {
		this.message = message;
	}

}
