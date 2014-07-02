package br.com.automag.controller;

import javax.inject.Inject;

import br.com.automag.entity.usuarios.Cliente;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.routes.annotation.Routed;

@Routed
@Controller
public class RegistroController {
	
	@Inject
	private Result result;
	
	
	public void formNovoCadastro(){
		
	}
	
	public void concluirNovoCadastro(Cliente cliente){
		
	}

}
