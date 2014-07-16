package br.com.automag.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpRequest;

import br.com.automag.auth.UsuarioLogado;
import br.com.automag.entity.usuarios.Cliente;
import br.com.automag.persistencia.ClienteDAO;
import br.com.automag.validators.LoginValidator;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.routes.annotation.Routed;
import br.com.caelum.vraptor.validator.Message;

@Routed
@Controller
public class AutenticadorController extends BaseController {
	
	@Inject private Result result;
	// @Inject private FacebookAuthService facebook;
	// @Inject private GoogleAuthService google;
	@Inject ClienteDAO clienteDAO;
	@Inject UsuarioLogado usuarioLogado; 
	@Inject LoginValidator loginValidator;
	@Inject HttpServletRequest request;

	@Post
	public void autenticador(String login, String password){
		if (loginValidator.validate(login, password)) {
			Cliente cliente = clienteDAO.getClienteWithLogin(login);
			loginValidator.validateCliente(cliente);
		
			if(cliente != null && cliente.getContaPrincipal().getPassword().equals(password)){
				usuarioLogado.logaCliente(cliente);
				result.redirectTo(ClienteController.class).dashboard();
			}else{
				loginValidator.getValidator().add(i18n("errorlogin", "auth.invalid.login"));
			}
		}

		List<Message> errors = loginValidator.getValidator().getErrors();
		
		if(!errors.isEmpty()){
			loginValidator.getValidator().onErrorRedirectTo(IndexController.class).registrese();
		}
		
	}
	
	public void logoff(){
		HttpSession session = request.getSession();
		session.invalidate();
		usuarioLogado.desloga();
		result.redirectTo(IndexController.class).index();
	}
	
}
