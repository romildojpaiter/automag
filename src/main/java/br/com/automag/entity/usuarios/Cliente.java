package br.com.automag.entity.usuarios;

import java.util.ArrayList;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.deprecated.old.Imagem;
import br.com.automag.entity.deprecated.old.Veiculo;
import br.com.automag.paiter.core.entity.BasePersistEntity;

public class Cliente extends BasePersistEntity<Long> implements ClienteAutenticavel {

	private DOMINIO_TIPO_CLIENTE tipoCliente;

	private PessoaJuridica pessoaJuridica;

	private ArrayList<Veiculo> veiculos;

	private CategoriaCliente[] categorias;

	private Servico servicos;

	private Localidade localidade;

	private Usuario usuarioPrincipal;

	private Usuario[] usuarios;

	private Imagem logomarca;

	private Pessoa pessoa;

	private Telefone[] telefones;

	private Endereco endereco;

	private Classificado[] classificados;

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

	public Veiculo[] getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	public CategoriaCliente[] getCategorias() {
		return categorias;
	}

	public void setCategorias(CategoriaCliente[] categorias) {
		this.categorias = categorias;
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

	public Usuario getUsuarioPrincipal() {
		return usuarioPrincipal;
	}

	public void setUsuarioPrincipal(Usuario usuarioPrincipal) {
		this.usuarioPrincipal = usuarioPrincipal;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
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

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Classificado[] getClassificados() {
		return classificados;
	}

	public void setClassificados(Classificado[] classificados) {
		this.classificados = classificados;
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
	

}
