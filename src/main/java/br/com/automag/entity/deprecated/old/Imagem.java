package br.com.automag.entity.deprecated.old;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import br.com.automag.entity.deprecated.veiculos.Veiculo;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="imagem_seq", sequenceName = "imagem_seq", allocationSize = 1)
public class Imagem extends BasePersistEntity<Long>{

	@ManyToOne
	@JoinColumn(name="idcarro",
		nullable=false,
		insertable=true)
	public Veiculo carro;
	
	@Basic(fetch=FetchType.EAGER)
	@Lob
	public byte[] data;
	
	@NotNull
	public String contentType;
	
	@NotNull
	public String name;
	
	@NotNull
	public String size;
	
	public Veiculo getCarro() {
		return carro;
	}

	public void setCarro(Veiculo carro) {
		this.carro = carro;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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
