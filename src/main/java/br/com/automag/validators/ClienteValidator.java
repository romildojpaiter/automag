package br.com.automag.validators;

import javax.inject.Inject;

import br.com.automag.persistencia.ClienteDAO;
import br.com.caelum.vraptor.validator.Validator;
import br.com.paiter.core.factory.MessageFactory;

public class ClienteValidator {
	
	private ClienteDAO clienteDAO;
	private Validator validator;
	private MessageFactory messageFactory;
	
	@Deprecated
	public ClienteValidator() {
	}

	@Inject
	public ClienteValidator(Validator validator, ClienteDAO clienteDao, MessageFactory messageFactory) {
		this.clienteDAO = clienteDao;
		this.validator = validator;
		this.messageFactory = messageFactory;
	}
	
	public void validate(String login) {
		if (clienteDAO.existsWithLogin(login)) {
			validator.add(messageFactory.build("error", "user.errors.login.used"));
		}
		if (login == null) {
			validator.add(messageFactory.build("error", "user.errors.login.required"));
		}
		
	}

	public <T> T onErrorRedirectTo(T controller){
		return validator.onErrorRedirectTo(controller);
	}
	
	public Validator getValidator() {
		return validator;
	}
	
}
