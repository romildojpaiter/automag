package br.com.automag.entity.deprecated.old;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Loja extends Cliente  {

    @OneToMany(fetch=FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
    @OrderColumn(name="posicao")
    @JoinTable(name="loja_carro",
		joinColumns=@JoinColumn(name="idLoja"),
		inverseJoinColumns=@JoinColumn(name="idCarro", unique=false))
	private List<Veiculo> carros;
    
	@ManyToOne
	@JoinColumn(name="idimagem")
	private ImagemGenerica logomarca;


	public List<Veiculo> getCarros() {
		return carros;
	}


	public void setCarros(List<Veiculo> carros) {
		this.carros = carros;
	}


	public ImagemGenerica getLogomarca() {
		return logomarca;
	}


	public void setLogomarca(ImagemGenerica logomarca) {
		this.logomarca = logomarca;
	}


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
 
