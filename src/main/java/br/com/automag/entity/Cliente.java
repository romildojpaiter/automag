package br.com.automag.entity;

import br.com.automag.paiter.dominio.DominioTipoDocumento.DOMINIO_TIPO_DOCUMENTO;

public abstract class Cliente {

	protected DOMINIO_TIPO_DOCUMENTO tipoDocumento;
	
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
	
	
}
