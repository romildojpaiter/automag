package br.com.automag.entity.deprecated.clientes;

import javax.persistence.Embeddable;

@Embeddable
public class PessoaJuridica {

	private String documentoCNPJ;

	private String inscricaoEstadual;

	private String razaoSocial;

	private String nomeFantasia;

	public String getDocumentoCNPJ() {
		return documentoCNPJ;
	}

	public void setDocumentoCNPJ(String documentoCNPJ) {
		this.documentoCNPJ = documentoCNPJ;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
