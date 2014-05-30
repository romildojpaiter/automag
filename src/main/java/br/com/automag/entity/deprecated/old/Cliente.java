package br.com.automag.entity.deprecated.old;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioTipoDocumento.DOMINIO_TIPO_DOCUMENTO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Cliente extends BasePersistEntity<Long> {
	
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

	
}
