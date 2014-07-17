package br.com.paiter.core.exception;

public class ServidorIndisponivelException extends RuntimeException {

	public ServidorIndisponivelException(String url, Throwable cause) {
		super( "Erro ao fazer requisição ao servidor na url " + url, cause);
	}
	

}
