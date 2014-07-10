package br.com.automag.validators;

import javax.inject.Inject;

import br.com.automag.entity.usuarios.Cliente;
import br.com.caelum.vraptor.validator.Validator;
import br.com.paiter.core.factory.MessageFactory;

public class LoginValidator {
	
	public static final int PASSWORD_MIN_LENGTH = 5;
	public static final int PASSWORD_MAX_LENGTH = 100;
	
	private Validator validator;
	private MessageFactory messageFactory;

	@Deprecated
	public LoginValidator() {
	}

	@Inject
	public LoginValidator(Validator validator, MessageFactory messageFactory) {
		this.validator = validator;
		this.messageFactory = messageFactory;
	}
	
	public boolean validate(String login, String password){
		if (password == null || password.length() < PASSWORD_MIN_LENGTH || password.length() > PASSWORD_MAX_LENGTH){
			validator.add(messageFactory.build("errorlogin", "user.errors.password.length"));
		}
		if (login == null) {
			validator.add(messageFactory.build("errorlogin", "user.errors.login.required"));
		}
		return !validator.hasErrors();
	}

	public void validateCliente(Cliente cliente){
		if(cliente == null){
			validator.add(messageFactory.build("errorlogin", "user.errors.cliente.inexistente"));
		}
	}
	
	
	public <T> T onErrorRedirectTo(T controller){
		return validator.onErrorRedirectTo(controller);
	}

	public Validator getValidator() {
		return validator;
	}


}
