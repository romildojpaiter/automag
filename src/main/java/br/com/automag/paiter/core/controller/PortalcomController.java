package br.com.automag.paiter.core.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class PortalcomController {

	@Inject
	private Result result;
	
	@Get("/portalcom/index")
	public void index(){
		result.include("mensagem", "Página de Login da Administração");
	}
}
