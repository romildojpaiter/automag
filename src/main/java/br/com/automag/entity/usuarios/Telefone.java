package br.com.automag.entity.usuarios;

import br.com.automag.paiter.core.entity.BasePersistEntity;

public class Telefone extends BasePersistEntity<Long>{

	private String numero;

	public String getNumeroTelefoneFormatado() {
		return null;
	}

	public void limpaNumeroTelefone() {

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
