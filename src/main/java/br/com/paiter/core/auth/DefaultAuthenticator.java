package br.com.paiter.core.auth;

import javax.inject.Inject;

import br.com.automag.entity.usuarios.Conta;
import br.com.automag.persistencia.ClienteDAO;

public class DefaultAuthenticator {

	@Inject private ClienteDAO clienteDao;
	@Inject private Access system;

	public boolean authenticate(String login, String password) {
		Conta retrieved = clienteDao.findByMailAndPassword(login, password);
		if (retrieved == null) {
		    retrieved = clienteDao.findByMailAndLegacyPasswordAndUpdatePassword(login, password);
		}
		if (retrieved == null) {
			return false;
		}
		
		system.login(retrieved);
		return true;
	}

	public void signout() {
		// system.logout();
	}

}
