package br.com.automag.entity.usuarios.interfaces;

public interface ClienteAutenticavel {

	public boolean validaPassword(String password, String temporalPassword);

	public abstract boolean login();

}
