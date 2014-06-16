package br.com.automag.paiter.core.entity;

import java.util.Calendar;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import br.com.automag.dominio.DominioAtivoInativo.DOMINIO_ATIVO_INATIVO;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;

@MappedSuperclass
public abstract class BasePersistEntity {

	
	@Temporal(TemporalType.DATE)
	protected Calendar dataCadastro;
	
	@Enumerated(EnumType.STRING)
	protected DOMINIO_SIM_NAO removido;
	
	@Enumerated(EnumType.STRING)
	protected DOMINIO_ATIVO_INATIVO situacao;
	
	public abstract Long getId();
	
	public abstract void setId(Long id);
	
	public DOMINIO_SIM_NAO getRemovido(){
		return this.removido;
	}
	
	public void setRemovido(DOMINIO_SIM_NAO removido){
		this.removido = removido;
	}

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object objeto);

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public DOMINIO_ATIVO_INATIVO getSituacao() {
		return situacao;
	}

	public void setSituacao(DOMINIO_ATIVO_INATIVO situacao) {
		this.situacao = situacao;
	}
	
}
