package br.com.automag.entity.deprecated.clientes;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioEstado.DOMINIO_ESTADO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Localidade extends BasePersistEntity<Long> {
	
	@NotNull
	private String municipio;

	@Enumerated(EnumType.STRING)
	private DOMINIO_ESTADO estado;

	private ArrayList<Loja> lojas;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((municipio == null) ? 0 : municipio.hashCode());
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
		Localidade other = (Localidade) obj;
		if (estado != other.estado)
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		return true;
	}

}
