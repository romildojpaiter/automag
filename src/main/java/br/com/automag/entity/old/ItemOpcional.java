package br.com.automag.entity.old;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class ItemOpcional extends BasePersistEntity<Long> {
 
	@NotNull
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private String dataCadastro;
	 
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
 
