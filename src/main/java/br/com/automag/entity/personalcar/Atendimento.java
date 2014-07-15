package br.com.automag.entity.personalcar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Where;

import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="atendimento_seq",sequenceName="atendimento_seq",allocationSize=1)
public class Atendimento extends BasePersistEntity {
	
	@Id
	@GeneratedValue(generator="atendimento_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	
	@OneToOne(mappedBy="atendimento")
	private PedidoServico pedidoServico;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public PedidoServico getPedidoServico() {
		return pedidoServico;
	}


	public void setPedidoServico(PedidoServico pedidoServico) {
		this.pedidoServico = pedidoServico;
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
		Atendimento other = (Atendimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	
}
