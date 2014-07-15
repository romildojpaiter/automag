package br.com.automag.entity.arquivos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="imagem_seq",sequenceName="imagem_seq",allocationSize=1)
public class Imagem extends BasePersistEntity {

	@Id
	@GeneratedValue(generator="imagem_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Lob
	private byte binaryStream;

	@NotNull
	private String contentType;

	@NotNull
	private String name;

	@NotNull
	private String size;

	public byte getBinaryStream() {
		return binaryStream;
	}

	public void setBinaryStream(byte binaryStream) {
		this.binaryStream = binaryStream;
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


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Imagem other = (Imagem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
