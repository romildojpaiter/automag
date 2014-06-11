package br.com.automag.entity.personalcar;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Atendimento extends BasePersistEntity<Long> {
	
	@OneToOne(mappedBy="atendimento")
	private PedidoServico pedidoServico;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pedidoServico == null) ? 0 : pedidoServico.hashCode());
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
		Atendimento other = (Atendimento) obj;
		if (pedidoServico == null) {
			if (other.pedidoServico != null)
				return false;
		} else if (!pedidoServico.equals(other.pedidoServico))
			return false;
		return true;
	}
	
}
