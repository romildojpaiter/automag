package br.com.automag.entity.clientes;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.automag.dominio.DominioSexo.DOMINIO_SEXO;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.entity.servicos.PedidoServico;

@Entity
public class Pessoa extends Cliente implements ClienteAutenticavel {

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO concordaTermosDeUso;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO aceitaReceberEmail;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SEXO sexo;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	private ArrayList<PedidoServico> pedidosDeServicos;

	private ArrayList<Telefone> telefones;

	private ArrayList<Endereco> enderecos;


	/**
	 * @see br.com.automag.entity.clientes.ClienteAutenticavel#validaPassword(int, int)
	 */
	public boolean validaPassword( String password, String temporalPassword) {
		return false;
	}


	/**
	 * @see br.com.automag.entity.clientes.ClienteAutenticavel#login()
	 */
	public boolean login() {
		return false;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean equals(Object objeto) {
		// TODO Auto-generated method stub
		return false;
	}

}
