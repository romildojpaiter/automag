package br.com.paiter.core.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Message;
import br.com.paiter.core.entity.portalcom.Usuario;
import br.com.paiter.core.validators.PortalcomValidator;

@Controller
public class PortalcomController {

	@Inject
	HttpServletRequest request;
	@Inject
	PortalcomValidator validator;

	private Result result;

	/*
	 * Deprecated by CDI
	 */
	public PortalcomController() {
	}

	@Inject
	public PortalcomController(Result result) {
		this.result = result;
	}

	@Path("/portalcom/index")
	public void index() {
		result.redirectTo(this).formLogin();
	}

	@Path("/portalcom/login")
	public void formLogin() {
		result.include("mensagem", "Pagina de Login");
		// result.use(FreemarkerView.class).withTemplate("portalcom/login");
	}

	@Path("/portalcom/autentica")
	@Transactional
	@Post
	public void autentica(Usuario usuario, boolean remember){
		
			validator.validate(usuario);
			validator.validateUsuarioInformado(usuario);
			validator.validateAutenticacaoUsuario(usuario);
			
			List<Message> errors = validator.getValidator().getErrors();
			if(!errors.isEmpty()){
				validator.getValidator().onErrorRedirectTo(this).formLogin();;
			}
			
      // session.setAttribute(ConstantesSistema.NOME_USUARIO, usuario.getNome());
      result.redirectTo(this).dashboard();
      
	}

	public void dashboard() {

	}

	@Get("/portalcom/logout")
	public void logout() {
		result.redirectTo(this).index();
	}


}
