package br.com.automag.entity.usuarios;

import java.util.List;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ListIndexBase;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.arquivos.Imagem;
import br.com.automag.entity.servico.Classificado;
import br.com.automag.entity.servico.Servico;
import br.com.automag.entity.usuarios.interfaces.ClienteAutenticavel;
import br.com.automag.entity.veiculos.Veiculo;
import br.com.automag.paiter.core.entity.BasePersistEntity;
import br.com.automag.paiter.core.entity.portalcom.CategoriaCliente;

@Entity
public class Cliente extends BasePersistEntity<Long> implements ClienteAutenticavel {

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CLIENTE tipoCliente;

	@OneToOne(mappedBy="cliente")
	private Pessoa pessoa;

	@Embedded
	private Endereco endereco;

	@Embedded
	private PessoaJuridica pessoaJuridica;

	@OneToOne(mappedBy="cliente")
	private Conta contaPrincipal;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_contas", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idConta", unique = false))
	private Set<Conta> conta;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_veiculos", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idVeiculos", unique = false))
	private List<Veiculo> veiculos;
	
	@ManyToOne
	@JoinColumn(name="idLogomarca",
		nullable=false,
		insertable=true)	
	private Imagem logomarca;
	
	@ManyToOne
	@JoinColumn(name="idLocalidade",
		nullable=false,
		insertable=true)
	private Localidade localidade;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_servicos", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idServico", unique = false))
	private List<Servico> servicos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_categorias", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idCategoria", unique = false))
	private List<CategoriaCliente> categorias;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_telefones", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idTelefone", unique = false))
	private List<Telefone> telefones;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "cliente_classificados", 
		joinColumns = @JoinColumn(name = "idCliente"), 
		inverseJoinColumns = @JoinColumn(name = "idClassificado", unique = false))
	private List<Classificado> classificados;

	/*
	 *  Metódos da Classe
	 */
	
	
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

	public Set<Conta> getConta() {
		return conta;
	}

	public void setConta(Set<Conta> conta) {
		this.conta = conta;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public List<CategoriaCliente> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaCliente> categorias) {
		this.categorias = categorias;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Classificado> getClassificados() {
		return classificados;
	}

	public void setClassificados(List<Classificado> classificados) {
		this.classificados = classificados;
	}

}
