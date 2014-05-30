package br.com.automag.entity.deprecated.servicos;

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
import br.com.automag.entity.deprecated.clientes.Cliente;
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
	private Cliente cliente;

	@OneToOne
	private Atendimento atendimento;

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object objeto) {
		// TODO Auto-generated method stub
		return false;
	}


}
