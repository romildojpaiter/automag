package br.com.automag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import br.com.automag.paiter.core.entity.PersistEntity;

@Entity
@SequenceGenerator(name="imagem_seq", sequenceName = "imagem_seq", allocationSize = 1)
public class Imagem implements PersistEntity{

	@Id
	@GeneratedValue(generator="imagem_seq", strategy=GenerationType.SEQUENCE)
	public Long idImagem;
	
	@ManyToOne
	@JoinColumn(name="idcarro",
		nullable=false,
		insertable=true)
	public Carro carro;
	
	@Lob
	public byte data;
	
	@NotNull
	public String contentType;
	
	@NotNull
	public String name;
	
	@NotNull
	public String size;
	
	@Override
	public Long getId() {
		return idImagem;
	}

	public Long getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(Long idImagem) {
		this.idImagem = idImagem;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public byte getData() {
		return data;
	}

	public void setData(byte data) {
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

}
