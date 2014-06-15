package br.com.automag.paiter.core.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.automag.paiter.core.business.UsuarioBusiness;
import br.com.automag.paiter.core.entity.portalcom.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class UsuarioController {
	
	@Inject
	Result result;

	private UsuarioBusiness useBusiness;

	public UsuarioController() {
	}

	@Inject
	public UsuarioController(UsuarioBusiness useBusiness) {
		this.useBusiness = useBusiness;
	}
	
	@Path("/portalcom/usuario/formulario")
	public void formulario(){
		
	}
	
	@Path("/portalcom/usuario/salvar")
	public void salvar(Usuario usuario, Result result){
		
		useBusiness.grava(usuario);
		result.redirectTo(this).lista();
	}
	
	@Path("/portalcom/usuario/lista")
	public List<Usuario> lista(){
		return useBusiness.todosUsuario();
	}
	
	/*
	 * 	@Path("/portalcom/usuario/lista")
	public void lista(){
		result.include("usuariosList", useBusiness.todosUsuario());
	}
	 */
	
	@Path("/portalcom/usuario/editar")
	public void editar(String idUsuario, Result result){
		
		Usuario usuario = useBusiness.encontrarUsuarioById(idUsuario);
		
		result.include("usuario",usuario);
		result.of(this).formulario();
	}
	
}
