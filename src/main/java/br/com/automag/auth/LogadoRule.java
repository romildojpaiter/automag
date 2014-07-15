package br.com.automag.auth;

import javax.inject.Inject;

import br.com.caelum.brutauth.auth.annotations.HandledBy;
import br.com.caelum.brutauth.auth.rules.CustomBrutauthRule;

@HandledBy(LogadoHandler.class)
public class LogadoRule implements CustomBrutauthRule {
	
    @Inject private UsuarioLogado userLogado;
    
    public boolean isAllowed() {
        return userLogado.isLoggedIn();
    }
}
