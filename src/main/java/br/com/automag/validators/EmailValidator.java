package br.com.automag.validators;

import javax.inject.Inject;

import br.com.automag.persistencia.ClienteDAO;
import br.com.caelum.vraptor.validator.Validator;
import br.com.paiter.core.factory.MessageFactory;

public class EmailValidator {
	
	private ClienteDAO clienteDAO;
	private Validator validator;
	private MessageFactory messageFactory;
	
	@Deprecated
	public EmailValidator() {
	}

	@Inject
	public EmailValidator(Validator validator, ClienteDAO clienteDao, MessageFactory messageFactory) {
		this.clienteDAO = clienteDao;
		this.validator = validator;
		this.messageFactory = messageFactory;
	}
	
	public void validate(String email) {
		if (clienteDAO.existsWithEmail(email)) {
			validator.add(messageFactory.build("error", "user.errors.email.used"));
		}
		if (email == null) {
			validator.add(messageFactory.build("error", "user.errors.email.required"));
		}
		
	}
	
	public <T> T onErrorRedirectTo(T controller){
		return validator.onErrorRedirectTo(controller);
	}
	
	public Validator getValidator() {
		return validator;
	}	
	
}
