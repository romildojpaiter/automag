package br.com.automag.auth;

import javax.inject.Inject;

import br.com.automag.controller.IndexController;
import br.com.caelum.brutauth.auth.handlers.RuleHandler;
import br.com.caelum.vraptor.Result;

public class LogadoHandler implements RuleHandler {
    
	@Inject Result result;
	
    @Override
    public void handle() {
    result.include("erro", " * Você precisa estar identificado para acessar está área.");
        result.forwardTo(IndexController.class).index();
    }
}


