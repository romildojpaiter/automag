package br.com.automag.controller;

import javax.inject.Inject;

import br.com.automag.validators.LoginValidator;
import br.com.automag.validators.UrlValidator;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.routes.annotation.Routed;
import br.com.paiter.core.auth.DefaultAuthenticator;

@Routed
@Controller
public class ClienteController extends BaseController {
	
	@Inject private DefaultAuthenticator auth;
	@Inject private Result result;
	// @Inject private FacebookAuthService facebook;
	// @Inject private GoogleAuthService google;
	@Inject private UrlValidator urlValidator;
	@Inject private LoginValidator validator;

	@Post
	public void login(String login, String password, String redirectUrl) {
		if (validator.validate(login, password) && auth.authenticate(login, password)) {
			redirectToRightUrl(redirectUrl);
		} else {
			includeAsList("messages", i18n("error", "auth.invalid.login"));
			redirectTo(this).loginForm(redirectUrl);
			validator.onErrorRedirectTo(this).loginForm(redirectUrl);
		}
	}
	
	private void loginForm(String redirectUrl) {
		// TODO Auto-generated method stub
		
	}

	private void redirectToRightUrl(String redirectUrl) {
		boolean valid = urlValidator.isValid(redirectUrl);
		if (!valid) {
			includeAsList("messages", i18n("error", "error.invalid.url", redirectUrl));
		}
        if (redirectUrl != null && !redirectUrl.isEmpty() && valid) {
            redirectTo(redirectUrl);
        } else {
            redirectTo(IndexController.class).index();
        }
	}
	
}
