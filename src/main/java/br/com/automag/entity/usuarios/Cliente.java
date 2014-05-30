package br.com.automag.entity.usuarios;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.deprecated.old.Imagem;
import br.com.automag.entity.deprecated.old.Veiculo;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Cliente extends BasePersistEntity<Long> implements ClienteAutenticavel {

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CLIENTE tipoCliente;

	private PessoaJuridica pessoaJuridica;

	private ArrayList<Veiculo> veiculos;

	private ArrayList<CategoriaCliente> categorias;

	private Servico servicos;

	private Localidade localidade;

	private UsuarioCliente usuarioPrincipal;

	private Set<UsuarioCliente> usuarios;

	private Imagem logomarca;

	private Pessoa pessoa;

	private ArrayList<Telefone> telefones;

	private Endereco endereco;

	private ArrayList<Classificado> classificados;

	public String gerarMetadadaServicos() {
		return null;
	}

	public void criarPessoaFisicaOuPessoaJuricica() {

	}


	/**
	 * @see br.com.automag.entity.usuarios.ClienteAutenticavel#validaPassword(int, int)
	 */
	public boolean validaPassword(String password, String temporalPassword) {
		return false;
	}


	/**
	 * @see br.com.automag.entity.usuarios.ClienteAutenticavel#login()
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

	public Servico getServicos() {
		return servicos;
	}

	public void setServicos(Servico servicos) {
		this.servicos = servicos;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public UsuarioCliente getUsuarioPrincipal() {
		return usuarioPrincipal;
	}

	public void setUsuarioPrincipal(UsuarioCliente usuarioPrincipal) {
		this.usuarioPrincipal = usuarioPrincipal;
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
				+ ((usuarioPrincipal == null) ? 0 : usuarioPrincipal.hashCode());
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
		if (usuarioPrincipal == null) {
			if (other.usuarioPrincipal != null)
				return false;
		} else if (!usuarioPrincipal.equals(other.usuarioPrincipal))
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

	public Set<UsuarioCliente> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<UsuarioCliente> usuarios) {
		this.usuarios = usuarios;
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
	

}
