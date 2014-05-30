package br.com.automag.entity.deprecated.clientes;

public interface ClienteAutenticavel {

	public boolean validaPassword(String password, String temporalPassword);

	public boolean login();

}
