package br.com.automag.entity.clientes;

import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.dominio.DominioTipoLoja.DOMINIO_TIPO_LOJA;
import br.com.automag.entity.old.ImagemGenerica;
import br.com.automag.entity.old.Veiculo;

@Entity
public class Loja extends Cliente implements ClienteAutenticavel {

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CLIENTE tipoCliente;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_LOJA tipoLoja;

	@Embedded
	private PessoaJuridica pessoaJuridica;

	@Embedded
	private PessoaFisica pessoaFisica;

	private ArrayList<Veiculo> veiculos;

	private ImagemGenerica logomarca;

	private ArrayList<CategoriaCliente> categorias;

	private ArrayList<Servico> servicos;

	private ArrayList<Telefone> telefones;

	private ArrayList<Endereco> enderecos;

	private Localidade localidade;

	public String gerarMetadadaServicos() {
		return null;
	}

	public void criarPessoaFisicaOuPessoaJuricica() {
		if(this.tipoCliente.equals(DOMINIO_TIPO_CLIENTE.PESSOA_FISICA)){
			
		}
	}


	/**
	 * @see br.com.automag.entity.clientes.ClienteAutenticavel#validaPassword(int, int)
	 */
	public boolean validaPassword(String password, String temporalPassword) {
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
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result
				+ ((enderecos == null) ? 0 : enderecos.hashCode());
		result = prime * result
				+ ((localidade == null) ? 0 : localidade.hashCode());
		result = prime * result
				+ ((logomarca == null) ? 0 : logomarca.hashCode());
		result = prime * result
				+ ((telefones == null) ? 0 : telefones.hashCode());
		result = prime * result
				+ ((tipoCliente == null) ? 0 : tipoCliente.hashCode());
		result = prime * result
				+ ((tipoLoja == null) ? 0 : tipoLoja.hashCode());
		result = prime * result
				+ ((veiculos == null) ? 0 : veiculos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		if (localidade == null) {
			if (other.localidade != null)
				return false;
		} else if (!localidade.equals(other.localidade))
			return false;
		if (logomarca == null) {
			if (other.logomarca != null)
				return false;
		} else if (!logomarca.equals(other.logomarca))
			return false;
		if (servicos == null) {
			if (other.servicos != null)
				return false;
		} else if (!servicos.equals(other.servicos))
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		if (tipoCliente != other.tipoCliente)
			return false;
		if (tipoLoja != other.tipoLoja)
			return false;
		if (veiculos == null) {
			if (other.veiculos != null)
				return false;
		} else if (!veiculos.equals(other.veiculos))
			return false;
		return true;
	}

	
}
