package br.com.automag.entity.usuarios;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ListIndexBase;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.deprecated.old.Imagem;
import br.com.automag.entity.deprecated.veiculos.Veiculo;
import br.com.automag.entity.usuarios.interfaces.ClienteAutenticavel;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Cliente extends BasePersistEntity<Long> implements ClienteAutenticavel {

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CLIENTE tipoCliente;

	@Embedded
	private PessoaJuridica pessoaJuridica;

	@OneToOne(mappedBy="cliente")
	private Conta contaPrincipal;
	
	private Set<Conta> conta;

	@OneToOne(mappedBy="cliente")
	private Pessoa pessoa;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_veiculos", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idVeiculos", unique = false))
	private ArrayList<Veiculo> veiculos;
	
	
	private Imagem logomarca;

	private Localidade localidade;
	
	@Embedded
	private Endereco endereco;

	
	private ArrayList<Servico> servicos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_categoria", 
	joinColumns = @JoinColumn(name = "idCliente"), 
	inverseJoinColumns = @JoinColumn(name = "idCategoria", unique = false))
	private ArrayList<CategoriaCliente> categorias;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_telefones", 
	joinColumns = @JoinColumn(name = "idCliente"), 
	inverseJoinColumns = @JoinColumn(name = "idTelefone", unique = false))
	private ArrayList<Telefone> telefones;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_classificados", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idClassificado", unique = false))
	private ArrayList<Classificado> classificados;

	public String gerarMetadadaServicos() {
		return null;
	}

	public void criarPessoaFisicaOuPessoaJuricica() {

	}


	/**
	 * @see br.com.automag.entity.usuarios.interfaces.ClienteAutenticavel#validaPassword(int, int)
	 */
	public boolean validaPassword(String password, String temporalPassword) {
		return false;
	}


	/**
	 * @see br.com.automag.entity.usuarios.interfaces.ClienteAutenticavel#login()
	 */
	public boolean login() {
		return false;
	}

	public DOMINIO_TIPO_CLIENTE getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(DOMINIO_TIPO_CLIENTE tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public Conta getContaPrincipal() {
		return contaPrincipal;
	}

	public void setContaPrincipal(Conta usuarioPrincipal) {
		this.contaPrincipal = usuarioPrincipal;
	}

	public Imagem getLogomarca() {
		return logomarca;
	}

	public void setLogomarca(Imagem logomarca) {
		this.logomarca = logomarca;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((contaPrincipal == null) ? 0 : contaPrincipal.hashCode());
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
		Cliente other = (Cliente) obj;
		if (contaPrincipal == null) {
			if (other.contaPrincipal != null)
				return false;
		} else if (!contaPrincipal.equals(other.contaPrincipal))
			return false;
		return true;
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public ArrayList<CategoriaCliente> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<CategoriaCliente> categorias) {
		this.categorias = categorias;
	}

	public Set<Conta> getConta() {
		return conta;
	}

	public void setConta(Set<Conta> usuarios) {
		this.conta = usuarios;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}

	public ArrayList<Classificado> getClassificados() {
		return classificados;
	}

	public void setClassificados(ArrayList<Classificado> classificados) {
		this.classificados = classificados;
	}

	public ArrayList<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}
	

}
