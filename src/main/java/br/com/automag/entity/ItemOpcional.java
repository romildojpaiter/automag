package br.com.automag.entity;

import br.com.automag.paiter.core.entity.PersistEntity;
import br.com.automag.paiter.dominio.DominioSimNao.DOMINIO_SIM_NAO;

public class ItemOpcional implements PersistEntity {
 
	private Long idItemOpcional;
	 
	private String nome;
	 
	private String dataCadastro;
	 
	private DOMINIO_SIM_NAO removido;
	

	@Override
	public Long getId() {
		return this.idItemOpcional;
	}

	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		return this.removido;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		this.removido = removido;
	}

	public Long getIdItemOpcional() {
		return idItemOpcional;
	}

	public void setIdItemOpcional(Long idItemOpcional) {
		this.idItemOpcional = idItemOpcional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
 
