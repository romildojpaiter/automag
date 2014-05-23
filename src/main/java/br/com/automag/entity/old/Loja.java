package br.com.automag.entity.old;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Loja extends Cliente implements BasePersistEntity<Long> {

    @OneToMany(fetch=FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
    @OrderColumn(name="posicao")
    @JoinTable(name="loja_carro",
		joinColumns=@JoinColumn(name="idLoja"),
		inverseJoinColumns=@JoinColumn(name="idCarro", unique=false))
	private List<Carro> carros;
    
	@ManyToOne
	@JoinColumn(name="idimagem")
	private ImagemGenerica logomarca;


	@Enumerated(EnumType.STRING)
	@NotNull
	private DOMINIO_SIM_NAO removido;

	@Version
	private Integer version;
	

	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		return removido;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		this.removido = removido;
	}


	public List<Carro> getCarros() {
		return carros;
	}


	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}


	public ImagemGenerica getLogomarca() {
		return logomarca;
	}


	public void setLogomarca(ImagemGenerica logomarca) {
		this.logomarca = logomarca;
	}


	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	 
}
 
