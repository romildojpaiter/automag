package br.com.automag.entity.deprecated.clientes;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioEstado.DOMINIO_ESTADO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Municipio extends BasePersistEntity<Long> {
	
	@NotNull
	private String nome;

	@Enumerated(EnumType.STRING)
	private DOMINIO_ESTADO estado;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Municipio other = (Municipio) obj;
		if (estado != other.estado)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


}
