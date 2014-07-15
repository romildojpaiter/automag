package br.com.automag.controller;

import javax.inject.Inject;

import br.com.automag.auth.LogadoRule;
import br.com.automag.persistencia.ClienteDAO;
import br.com.caelum.brutauth.auth.annotations.CustomBrutauthRules;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.routes.annotation.Routed;

@Routed
@Controller
public class ClienteController {

	
	@Inject private Result result;
	@Inject private ClienteDAO clienteDAO;

	@Get
	@CustomBrutauthRules(LogadoRule.class)
	public void dashboard(){
		
	}
}
