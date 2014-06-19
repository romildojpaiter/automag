package br.com.automag.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	@Inject
	private Result result;
	
	@Get("/index")
	public void index(){
		result.include("mensagem", "pagina INDEX do Vraptor");
	}
	
	@Get("/home")
	public void home(){
		result.include("mensagem", "Ola, Vraptor 4!");
	}

	
	
	
	/*
	@Path("/indexVelocity")
	public void indexVelocity(){
		result.include("mensagem", "Ola, Vraptor 4 com velocity!");
		result.forwardTo("/index.vm");
	}
	
	@Path("/portalcom/dashboard")
	@Get
	public void indexFreemarker(){
		result.include("mensagem", "Ola, Vraptor 4 com freemarker");
		result.use(FreemarkerView.class).withTemplate("dashboard");
	}
	*/
}
