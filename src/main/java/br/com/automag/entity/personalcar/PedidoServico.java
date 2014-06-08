package br.com.automag.entity.personalcar;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.entity.usuarios.Pessoa;
import br.com.automag.paiter.core.entity.BasePersistEntity;

public class PedidoServico extends BasePersistEntity<Long> {

	private String descricaoServico;

	@Column(columnDefinition="character(3) default NAO")
	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO atendido;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtendimento;

	private Pessoa pessoa;

	private Atendimento atendimento;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((atendido == null) ? 0 : atendido.hashCode());
		result = prime * result
				+ ((atendimento == null) ? 0 : atendimento.hashCode());
		result = prime * result
				+ ((dataAtendimento == null) ? 0 : dataAtendimento.hashCode());
		result = prime
				* result
				+ ((descricaoServico == null) ? 0 : descricaoServico.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		PedidoServico other = (PedidoServico) obj;
		if (atendido != other.atendido)
			return false;
		if (atendimento == null) {
			if (other.atendimento != null)
				return false;
		} else if (!atendimento.equals(other.atendimento))
			return false;
		if (dataAtendimento == null) {
			if (other.dataAtendimento != null)
				return false;
		} else if (!dataAtendimento.equals(other.dataAtendimento))
			return false;
		if (descricaoServico == null) {
			if (other.descricaoServico != null)
				return false;
		} else if (!descricaoServico.equals(other.descricaoServico))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	

}
