package br.com.automag.business;

import javax.servlet.http.HttpServletRequest;

import br.com.automag.entity.usuarios.Conta;

public class LoggedUser {
	
	private final Conta conta;
	private final HttpServletRequest request;
	
	public LoggedUser(Conta user, HttpServletRequest request) {
		this.conta = user;
		this.request = request;
	}
	
	public Conta getCurrent() {
		return isLoggedIn() ? conta : Conta.GHOST;
	}

	public String getIp() {
		return request == null ? null : request.getRemoteAddr();
	}
	
//	public boolean isModerator() {
//	    return isLoggedIn() ? conta.isModerator() : false;
//	}
//	
//	public boolean canModerate() {
//		return isLoggedIn() ? conta.canModerate() : false;
//	}

	public boolean isLoggedIn() {
		return conta != null;
	}
	
	@Override
	public String toString() {
		return "[user = " + conta + ", ip = " + getIp() + "]";
	}


}
