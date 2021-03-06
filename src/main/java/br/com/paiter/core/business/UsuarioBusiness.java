package br.com.paiter.core.business;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.automag.dominio.DominioAtivoInativo.DOMINIO_ATIVO_INATIVO;
import br.com.automag.dominio.DominioPerfilUsuario.DOMINIO_PERFIL_USUARIO;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.paiter.core.entity.portalcom.Usuario;
import br.com.paiter.core.persistencia.impl.UsuarioDAO;

public class UsuarioBusiness {

	
	private UsuarioDAO usuarioDAO;

	/*
	 * @deprecated para uso no CDI
	 */
	public UsuarioBusiness(){};

	@Inject
	public UsuarioBusiness(UsuarioDAO usuarioDAO){
		this.usuarioDAO = usuarioDAO;
	}
	
	
	public void grava(Usuario usuario) throws Exception{
		try {
			if(usuario.getId() == null){
				completaInformcaoUsuario(usuario);
				usuarioDAO.save(usuario);
			}else{
				usuarioDAO.update(usuario);
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void completaInformcaoUsuario(Usuario usuario) {
		usuario.setDataCadastro(new Date());
		usuario.setPerfil(DOMINIO_PERFIL_USUARIO.ADMINISTRADOR);
		usuario.setRemovido(DOMINIO_SIM_NAO.NAO);
		usuario.setSituacao(DOMINIO_ATIVO_INATIVO.ATIVO);
	}

	public List<Usuario> todosUsuario(){
		
		return usuarioDAO.findAll();
	}

	public Usuario encontrarUsuarioById(String idUsuario) {
		return usuarioDAO.getById(Long.parseLong(idUsuario));
	}
	
}
