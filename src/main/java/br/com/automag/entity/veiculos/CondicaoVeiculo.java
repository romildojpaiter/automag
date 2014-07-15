package br.com.automag.entity.veiculos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Where;

import br.com.automag.dominio.DominioTipoCondicao.DOMINIO_TIPO_CONDICAO;
import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="condicao_veiculo_seq",sequenceName="condicao_veiculo_seq",allocationSize=1)
public class CondicaoVeiculo extends BasePersistEntity{
	
	@Id
	@GeneratedValue(generator="condicao_veiculo_seq", strategy=GenerationType.SEQUENCE)
	private Long id;

	@OneToOne(mappedBy="condicaoVeiculo")
	private Veiculo veiculo;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO pneus;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO interior;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO exterior;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO motor;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO freios;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO suspensao;

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CONDICAO bancos;

	public DOMINIO_TIPO_CONDICAO getPneus() {
		return pneus;
	}

	public void setPneus(DOMINIO_TIPO_CONDICAO pneus) {
		this.pneus = pneus;
	}

	public DOMINIO_TIPO_CONDICAO getInterior() {
		return interior;
	}

	public void setInterior(DOMINIO_TIPO_CONDICAO interior) {
		this.interior = interior;
	}

	public DOMINIO_TIPO_CONDICAO getExterior() {
		return exterior;
	}

	public void setExterior(DOMINIO_TIPO_CONDICAO exterior) {
		this.exterior = exterior;
	}

	public DOMINIO_TIPO_CONDICAO getMotor() {
		return motor;
	}

	public void setMotor(DOMINIO_TIPO_CONDICAO motor) {
		this.motor = motor;
	}

	public DOMINIO_TIPO_CONDICAO getFreios() {
		return freios;
	}

	public void setFreios(DOMINIO_TIPO_CONDICAO freios) {
		this.freios = freios;
	}

	public DOMINIO_TIPO_CONDICAO getSuspensao() {
		return suspensao;
	}

	public void setSuspensao(DOMINIO_TIPO_CONDICAO suspensao) {
		this.suspensao = suspensao;
	}

	public DOMINIO_TIPO_CONDICAO getBancos() {
		return bancos;
	}

	public void setBancos(DOMINIO_TIPO_CONDICAO bancos) {
		this.bancos = bancos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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
		CondicaoVeiculo other = (CondicaoVeiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}


}
