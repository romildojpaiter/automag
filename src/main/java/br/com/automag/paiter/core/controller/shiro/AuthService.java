package br.com.automag.paiter.core.controller.shiro;

import java.util.Set;

import javax.inject.Inject;

import br.com.automag.paiter.core.entity.portalcom.Usuario;
import br.com.automag.paiter.core.persistencia.impl.UsuarioDAO;
import br.com.caelum.vraptor.security.Permission;
import br.com.caelum.vraptor.security.User;

public class AuthService implements Permission {
	
	@Inject
	private UsuarioDAO usuarioDAO;

	@Override
	public Set<String> getPermissionsByRole(String role) {
		return usuarioDAO.listarPermissoesByPerfil(role);
	}

	@Override
	public Set<String> getRolesByUser(String username) {
		return usuarioDAO.listarPerfilsByUsername(username);
	}

	@Override
	public User getUserByUsername(String username) {
		Usuario usuario = usuarioDAO.selecionarUsuarioByUsername(username);
		if(usuario == null){
			return null;
		}
		return new User(usuario.getLogin(), usuario.getPassword());
	}

}
