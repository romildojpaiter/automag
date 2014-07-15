package br.com.automag.business;

import javax.inject.Inject;

import br.com.automag.entity.usuarios.Cliente;
import br.com.automag.persistencia.ClienteDAO;

public class ClienteBusiness {

	@Inject
	private ClienteDAO clienteDAO;
	
	
	public void salvar(Cliente cliente) throws Exception{
		clienteDAO.save(cliente);
	}
	
}
