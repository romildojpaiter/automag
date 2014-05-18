package br.com.automag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import br.com.automag.paiter.core.entity.PersistEntity;
import br.com.automag.paiter.dominio.DominioSimNao.DOMINIO_SIM_NAO;

@Entity
@SequenceGenerator(name="imagem_gene_seq", sequenceName = "imagem_gene_seq", allocationSize = 1)
public class ImagemGenerica implements PersistEntity{

	@Id
	@GeneratedValue(generator="imagem_gene_seq", strategy=GenerationType.SEQUENCE)
	public Long idImagemGenerica;
	
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
		return idImagemGenerica;
	}

	public Long getIdImagemGenerica() {
		return idImagemGenerica;
	}

	public void setIdImagemGenerica(Long idImagem) {
		this.idImagemGenerica = idImagem;
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

	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		// TODO Auto-generated method stub
		
	}

}
