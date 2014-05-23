package br.com.automag.paiter.core.entity;

import java.io.Serializable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;

@MappedSuperclass
public abstract class BasePersistEntity<ID extends Serializable> {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	protected ID id;
	
	@Enumerated(EnumType.STRING)
	protected DOMINIO_SIM_NAO removido;
	
	@Version
	protected Integer version;

	public ID getId(){
		return this.id;
	}
	
	public void setId(ID id){
		this.id = id;
	}
	
	public DOMINIO_SIM_NAO getRemovido(){
		return this.removido;
	}
	
	public void setRemovido(DOMINIO_SIM_NAO removido){
		this.removido = removido;
		
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object objeto);
	
	
}
