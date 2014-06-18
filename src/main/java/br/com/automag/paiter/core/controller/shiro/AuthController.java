package br.com.automag.paiter.core.controller.shiro;

import javax.inject.Inject;

import org.apache.shiro.authz.AuthorizationException;

import br.com.automag.paiter.core.controller.PortalcomController;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.security.AuthorizationRestrictionListener;

@Controller
public class AuthController implements AuthorizationRestrictionListener {

	@Inject
	private Result result;
	
	@Override
	public void onAuthorizationRestriction(AuthorizationException ae) {
		result.include("error", ae.toString() );
		
		result.forwardTo(PortalcomController.class).formLogin();
		// OR
		// result.use(Results.status()).forbidden(ae.toString());
	}

}
