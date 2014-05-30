package br.com.automag.entity.deprecated.clientes;

import javax.persistence.Embeddable;

@Embeddable
public class PessoaFisica {

	private String documentoCPF;

	private String documentoIdentidade;

	public String getDocumentoCPF() {
		return documentoCPF;
	}

	public void setDocumentoCPF(String documentoCPF) {
		this.documentoCPF = documentoCPF;
	}

	public String getDocumentoIdentidade() {
		return documentoIdentidade;
	}

	public void setDocumentoIdentidade(String documentoIdentidade) {
		this.documentoIdentidade = documentoIdentidade;
	}

}
