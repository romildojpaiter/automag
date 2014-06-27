package br.com.automag.persistencia;

import javax.persistence.EntityManager;

import br.com.automag.entity.usuarios.Cliente;
import br.com.automag.entity.usuarios.Conta;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class ClienteDAO extends GenericDAO<Long, Cliente>{

	public ClienteDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Conta findByMailAndPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Conta findByMailAndLegacyPasswordAndUpdatePassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsWithEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
