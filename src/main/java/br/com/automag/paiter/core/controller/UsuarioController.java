package br.com.automag.paiter.core.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.paiter.core.business.UsuarioBusiness;
import br.com.automag.paiter.core.entity.portalcom.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class UsuarioController {
	
	private UsuarioBusiness useBusiness;
	private Result result;
	private Validator validator;

	public UsuarioController() {
	}

	@Inject
	public UsuarioController(UsuarioBusiness useBusiness, Result result, Validator validator) {
		this.useBusiness = useBusiness;
		this.result = result;
		this.validator = validator;
	}
	
	@Path("/portalcom/usuario/formulario")
	public void formulario(){
		
	}
	
	@Path("/portalcom/usuario/salvar")
	@Transactional
	public void salvar(@Valid Usuario usuario){
		validator.onErrorRedirectTo(this).formulario();
		
		useBusiness.grava(usuario);
		result.redirectTo(this).lista();
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
		
		useBusiness.grava(usuario);
		
		result.redirectTo(this).lista();
	}
	
	
}
