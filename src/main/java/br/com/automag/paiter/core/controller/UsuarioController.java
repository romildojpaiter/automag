package br.com.automag.paiter.core.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.paiter.core.business.UsuarioBusiness;
import br.com.automag.paiter.core.entity.portalcom.Usuario;
import br.com.automag.paiter.core.validators.UsuarioValidator;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.security.annotation.Secured;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Message;

@Secured
@Controller
public class UsuarioController {
	
	private UsuarioBusiness useBusiness;
	private Result result;
	private UsuarioValidator validator;

	public UsuarioController() {
	}

	@Inject
	public UsuarioController(UsuarioBusiness useBusiness, Result result, UsuarioValidator validator) {
		this.useBusiness = useBusiness;
		this.result = result;
		this.validator = validator;
	}
	
	@Path("/portalcom/usuario/formulario")
	public void formulario(){
		
	}
	
	@Path("/portalcom/usuario/salvar")
	@Transactional
	public void salvar(Usuario usuario){
		validator.validate(usuario);
		List<Message> errors = validator.getValidator().getErrors();
		if(!errors.isEmpty()){
			validator.getValidator().onErrorRedirectTo(this).formulario();
		}
		
		try {
			useBusiness.grava(usuario);
			result.redirectTo(this).lista();
		} catch (Exception e) {
			validator.getValidator().add(new I18nMessage("email", e.getMessage()));
		}
	}
	
	@Path("/portalcom/usuario/lista")
	public List<Usuario> lista(){
		return useBusiness.todosUsuario();
	}
	
	@Path("/portalcom/usuario/editar")
	public void editar(String idUsuario){
		
		Usuario usuario = useBusiness.encontrarUsuarioById(idUsuario);
		
		result.include("usuario",usuario);
		result.of(this).formulario();
	}

	@Path("/portalcom/usuario/remover")
	public void remover(String idUsuario){
		
		Usuario usuario = useBusiness.encontrarUsuarioById(idUsuario);
		usuario.setRemovido(DOMINIO_SIM_NAO.SIM);
		
		try {
			useBusiness.grava(usuario);
			result.redirectTo(this).lista();
		} catch (Exception e) {
			validator.getValidator().add(new I18nMessage("email", e.getMessage()));
		}
		
	}
	
	
}
