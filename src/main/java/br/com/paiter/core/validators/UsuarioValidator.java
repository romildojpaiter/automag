package br.com.paiter.core.validators;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;

import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.paiter.core.entity.portalcom.Usuario;
import br.com.paiter.core.persistencia.impl.UsuarioDAO;

public class UsuarioValidator {

	
	private UsuarioDAO usuarioDAO;
	private Validator validator;

	public UsuarioValidator(){}
	
	@Inject
	public UsuarioValidator(Validator validator, UsuarioDAO usuarioDAO){
		this.validator = validator;
		this.usuarioDAO = usuarioDAO;
	}
	
	public void validate(Usuario usuario){
		validator.validate(usuario);
		
		if(!StringUtils.isEmpty(usuario.getEmail())){
			if(!usuarioDAO.emailJaCadastro(usuario.getEmail())){
				validator.add(new I18nMessage("email", "email.existe"));
			}
		}
		if(!StringUtils.isEmpty(usuario.getLogin())){
			if(!usuarioDAO.loginJaCadastro(usuario.getLogin())){
				validator.add(new I18nMessage("login", "login.existe"));
			}
		}
		
	}

	public Validator getValidator() {
		return validator;
	}
}
