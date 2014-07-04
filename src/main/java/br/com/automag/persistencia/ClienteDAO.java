package br.com.automag.persistencia;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.automag.entity.usuarios.Cliente;
import br.com.automag.entity.usuarios.Conta;
import br.com.automag.entity.usuarios.Pessoa;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class ClienteDAO extends GenericDAO<Long, Cliente>{

	@Inject
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
		try {
			Pessoa pessoa = this.getEntityManager().createNamedQuery("existsEmail", Pessoa.class).setParameter("email", email).getSingleResult();
			if(pessoa != null){
				return true;
			}
		} catch (NoResultException e) {
			
		}
		return false;
	}

	public boolean existsWithLogin(String login) {
		try {
			Conta conta = this.getEntityManager().createNamedQuery("existeLogin", Conta.class).setParameter("login", login).getSingleResult();
			if(conta != null){
				return true;
			}
		} catch (NoResultException e) {
			
		}
		return false;
	}
	
	

}
