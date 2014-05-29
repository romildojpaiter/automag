package br.com.automag.entity.clientes;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Telefone extends BasePersistEntity<Long> {

	@NotNull
	private String numero;
	
	
	private Pessoa pessoa;

	private Loja loja;

	public String getNumeroTelefoneFormatado() {
		return null;
	}

	public void limpaNumeroTelefone() {

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Telefone other = (Telefone) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
