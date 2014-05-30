package br.com.automag.entity.usuarios;

public interface ClienteAutenticavel {

	public boolean validaPassword(String password, String temporalPassword);

	public abstract boolean login();

}
