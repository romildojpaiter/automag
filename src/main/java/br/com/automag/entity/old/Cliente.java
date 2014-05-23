package br.com.automag.entity.old;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioTipoDocumento.DOMINIO_TIPO_DOCUMENTO;

@MappedSuperclass
public abstract class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Enumerated(EnumType.STRING)
	protected DOMINIO_TIPO_DOCUMENTO tipoDocumento;
	
	@NotNull
	protected String documento;

	public DOMINIO_TIPO_DOCUMENTO getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(DOMINIO_TIPO_DOCUMENTO tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object obj);
	
	
}
