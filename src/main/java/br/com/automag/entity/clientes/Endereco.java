package br.com.automag.entity.clientes;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import br.com.automag.dominio.DominioEstado.DOMINIO_ESTADO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="endereco_seq",sequenceName="endereco_seq",allocationSize=1)
public class Endereco extends BasePersistEntity<Long> {

	private String logradouro;

	private String bairro;

	private Integer numero;

	@Transient
	private DOMINIO_ESTADO estado;

	private String CEP;

	@ManyToOne
	private Municipio municipio;
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public DOMINIO_ESTADO getEstado() {
		return estado;
	}

	public void setEstado(DOMINIO_ESTADO estado) {
		this.estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
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
