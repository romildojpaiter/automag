package br.com.automag.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import br.com.automag.paiter.core.entity.PersistEntity;
import br.com.automag.paiter.dominio.DominioSimNao.DOMINIO_SIM_NAO;

@Entity
@SequenceGenerator(name="loja_seq", sequenceName="loja_seq", allocationSize=1)
public class Loja extends Cliente implements PersistEntity {

	@Id
	@GeneratedValue(generator="loja_seq", strategy=GenerationType.SEQUENCE)
	private Long idLoja;
	
    @OneToMany(fetch=FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
    @OrderColumn(name="posicao")
    @JoinTable(name="loja_carro",
		joinColumns=@JoinColumn(name="idLoja"),
		inverseJoinColumns=@JoinColumn(name="idCarro", unique=false))
	private List<Carro> carros;

	@Enumerated(EnumType.STRING)
	@NotNull
	private DOMINIO_SIM_NAO removido;

	
	@Override
	public Long getId() {
		return this.idLoja;
	}


	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		return removido;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		this.removido = removido;
	}
	 
}
 
