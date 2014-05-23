package br.com.automag.entity.servicos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.entity.clientes.Pessoa;
import br.com.automag.paiter.core.entity.BasePersistEntity;

public class PedidoServico extends BasePersistEntity<Long> {

	@NotNull
	@Column(columnDefinition="TEXT")
	private String descricaoServico;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO atendido;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicioAtendimento;

	@ManyToOne
	private Pessoa pessoa;

	@OneToOne
	private Atendimento atendimento;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((atendido == null) ? 0 : atendido.hashCode());
		result = prime * result
				+ ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime
				* result
				+ ((dataInicioAtendimento == null) ? 0 : dataInicioAtendimento
						.hashCode());
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
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataInicioAtendimento == null) {
			if (other.dataInicioAtendimento != null)
				return false;
		} else if (!dataInicioAtendimento.equals(other.dataInicioAtendimento))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	
	

}
