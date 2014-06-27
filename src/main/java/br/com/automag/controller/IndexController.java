package br.com.automag.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.routes.annotation.Routed;

@Routed
@Controller
public class IndexController {

	@Inject
	private Result result;
	
	@Get
	public void index(){
		result.include("mensagem", "pagina INDEX do Vraptor");
	}
	
	@Get
	public void registrese(){
		
	}
	
}
