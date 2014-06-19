package br.com.automag.entity.personalcar;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.entity.usuarios.Pessoa;
import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="pedido_servico_seq",sequenceName="pedido_servico_seq",allocationSize=1)
public class PedidoServico extends BasePersistEntity {

	@Id
	@GeneratedValue(generator="pedido_servico_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@NotNull
	private String descricaoServico;

	@Column(columnDefinition="character(3) default NAO")
	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO atendido;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtendimento;
	
	@ManyToOne
	@JoinColumn(name="idPessoa", nullable=false, 
		updatable=false, insertable=false)
	private Pessoa pessoa;

	@OneToOne
	@JoinColumn(name="idAtendimento")
	private Atendimento atendimento;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public DOMINIO_SIM_NAO getAtendido() {
		return atendido;
	}

	public void setAtendido(DOMINIO_SIM_NAO atendido) {
		this.atendido = atendido;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
