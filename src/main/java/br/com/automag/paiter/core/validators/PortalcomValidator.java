package br.com.automag.paiter.core.validators;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;

import br.com.automag.paiter.core.entity.portalcom.Usuario;
import br.com.caelum.vraptor.security.User;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;

public class PortalcomValidator {
	
	@Inject Validator validator;
	
	public void validateAutenticacaoUsuario(User user, Usuario usuario){
		if (user != null && !user.getPassword().equals(usuario.getPassword())) {
			validator.add(new I18nMessage("", "senha.invalida"));
		}
	}

	public Validator getValidator() {
		return validator;
	}

	public void validateUsuarioInformado(User user) {
		if(user == null){
			validator.add(new I18nMessage("", "problema.autenticacao"));
		}
	}

	public void validate(Usuario usuario) {
		if(StringUtils.isEmpty(usuario.getLogin())){
			validator.add(new I18nMessage("login", "login.nao.informado"));
		}
		if(StringUtils.isEmpty(usuario.getPassword())){
			validator.add(new I18nMessage("password", "password.nao.informado"));
		}
	}

}
