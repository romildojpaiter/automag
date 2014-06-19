package br.com.paiter.core.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.security.AuthorizationRestrictionListener;
import br.com.caelum.vraptor.security.User;
import br.com.caelum.vraptor.security.annotation.Secured;
import br.com.caelum.vraptor.validator.Message;
import br.com.paiter.core.contantes.ConstantesSistema;
import br.com.paiter.core.controller.shiro.AuthService;
import br.com.paiter.core.entity.portalcom.Usuario;
import br.com.paiter.core.validators.PortalcomValidator;

@Controller
public class PortalcomController implements AuthorizationRestrictionListener{
	

	@Inject Subject currentUser;
	@Inject Session session;
	@Inject AuthService authService;
	@Inject HttpServletRequest request;
	@Inject PortalcomValidator validator;

	private Result result;

	/*
	 * Deprecated by CDI
	 */
	public PortalcomController(){}
	
	@Inject
	public PortalcomController(Result result){
		this.result = result;
	}
	
	
	@Path("/portalcom/index")
	public void index(){
		result.redirectTo(this).formLogin();
	}
	
	@Path("/portalcom/login")
	public void formLogin(){
		result.include("mensagem", "Pagina de Login");		
		//result.use(FreemarkerView.class).withTemplate("portalcom/login");
	}
	
	@Path("/portalcom/autentica")
	@Transactional
	@Post
	public void autentica(Usuario usuario, boolean remember){
		
		try {
			
			User user = authService.getUserByUsername(usuario.getLogin());
			validator.validate(usuario);
			validator.validateUsuarioInformado(user);
			validator.validateAutenticacaoUsuario(user, usuario);
			
			List<Message> errors = validator.getValidator().getErrors();
			if(!errors.isEmpty()){
				validator.getValidator().onErrorRedirectTo(this).formLogin();;
			}
			
            currentUser.login(new UsernamePasswordToken(user.getUsername(), user.getPassword(), remember));
            session.setAttribute(ConstantesSistema.NOME_USUARIO, usuario.getNome());
            result.redirectTo(this).dashboard();
        } 
        catch (UnknownAccountException e) {} 
        catch (IncorrectCredentialsException e) {}
        catch (LockedAccountException e) {}
        catch (ExcessiveAttemptsException e) {}
        catch (AuthenticationException e) {}		
	}
	
	@Secured
	@RequiresAuthentication
	@RequiresUser
    public void dashboard() {

    }	

    @Get("/portalcom/logout")
    public void logout() {
    	currentUser.logout();
    	result.redirectTo(this).index();
    }

    @Override
	public void onAuthorizationRestriction(AuthorizationException authorizationException) {
		result.include("error", authorizationException.toString());
		result.redirectTo(this).formLogin();
	}
	
}
