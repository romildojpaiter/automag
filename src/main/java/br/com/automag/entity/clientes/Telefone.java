package br.com.automag.entity.clientes;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="telefone_seq", sequenceName="telefone_seq", allocationSize=1)
public class Telefone extends BasePersistEntity<Long> {

	private String prefixo;

	private String numero;

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((prefixo == null) ? 0 : prefixo.hashCode());
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
		if (prefixo == null) {
			if (other.prefixo != null)
				return false;
		} else if (!prefixo.equals(other.prefixo))
			return false;
		return true;
	}


}
