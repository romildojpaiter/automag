package br.com.paiter.core.auth;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.automag.entity.usuarios.Conta;
import br.com.automag.persistencia.ClienteDAO;
import br.com.paiter.core.infra.Digester;

@RequestScoped
public class Access {

	public static final String BRUTAL_SESSION = "brutal_session";

	private HttpServletResponse response;
	private HttpServletRequest request;
	private ClienteDAO clienteDao;

	@Deprecated
	public Access() {
	}

	@Inject
	public Access(HttpServletResponse response, HttpServletRequest request,
			ClienteDAO clienteDao) {
		this.response = response;
		this.request = request;
		this.clienteDao = clienteDao;
	}

	public Conta login(Conta conta) {

		String sessionKey = Digester.encrypt(""); // currentTimeMillis.toString() +
																							// this.id.toString()

		Cookie cookie = new Cookie(BRUTAL_SESSION, " "); // newSession.getSessionKey()
		cookie.setPath("/");
		cookie.setHttpOnly(true);
		cookie.setMaxAge(Integer.MAX_VALUE);
		response.addCookie(cookie);
		// clienteDao.save(newSession);
		// this.userAndSession = new UserAndSession(user, newSession);
		return conta;
	}

//	@Produces
//	public LoggedUser getInstance() {
//		User user = userAndSession == null ? null : userAndSession.getUser();
//		return new LoggedUser(user, request);
//	}
//
//	public boolean tryToAutoLogin() {
//		String key = extractKeyFromCookies();
//		if (key != null) {
//			this.userAndSession = clienteDao.findBySessionKey(key);
//		}
//		return this.userAndSession != null;
//	}
//
//	@PostConstruct
//	public void initialize() {
//		tryToAutoLogin();
//	}
//
//	private String extractKeyFromCookies() {
//		Cookie[] cookiesArray = request.getCookies();
//		if (cookiesArray != null) {
//			List<Cookie> cookies = Arrays.asList(cookiesArray);
//			for (Cookie cookie : cookies) {
//				if (cookie.getName().equals(BRUTAL_SESSION)) {
//					return cookie.getValue();
//				}
//			}
//		}
//		return null;
//	}
//
//	public void logout() {
//		Cookie cookie = new Cookie(BRUTAL_SESSION, "");
//		cookie.setPath("/");
//		cookie.setMaxAge(-1);
//		response.addCookie(cookie);
//		clienteDao.delete(userAndSession.getUserSession());
//		this.userAndSession = null;
//	}

}