package br.com.automag.entity.servicos;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="atendimento_seq",sequenceName="atendimento_seq",allocationSize=1)
public class Atendimento extends BasePersistEntity<Long> {

	@OneToOne
	private PedidoServico pedidoServico;
	
	

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
