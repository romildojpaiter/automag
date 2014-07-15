package br.com.automag.auth;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.usuarios.Cliente;

@SessionScoped
@Named("usuarioLogado")
public class UsuarioLogado implements Serializable{
	
	private Cliente cliente;
	private HttpServletRequest request;
	
	
	public void logaCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public Cliente getCurrent() {
		return isLoggedIn() ? this.cliente : null;
	}

	public String getIp() {
		return request == null ? null : request.getRemoteAddr();
	}
	
	public DOMINIO_TIPO_CLIENTE getTipoCliente() {
	    return isLoggedIn() ? cliente.getTipoCliente() : null;
	}
	

	public boolean isLoggedIn() {
		return cliente != null;
	}
	
	public void desloga(){
		this.cliente = null;
	}
	
	@Override
	public String toString() {
		return "[Cliente = " + cliente + ", ip = " + getIp() + "]";
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
