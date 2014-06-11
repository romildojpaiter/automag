package br.com.automag.entity.veiculos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import br.com.automag.dominio.DominioTipoCondicao.DOMINIO_TIPO_CONDICAO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class CondicaoVeiculo extends BasePersistEntity<Long>{

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bancos == null) ? 0 : bancos.hashCode());
		result = prime * result
				+ ((exterior == null) ? 0 : exterior.hashCode());
		result = prime * result + ((freios == null) ? 0 : freios.hashCode());
		result = prime * result
				+ ((interior == null) ? 0 : interior.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		result = prime * result + ((pneus == null) ? 0 : pneus.hashCode());
		result = prime * result
				+ ((suspensao == null) ? 0 : suspensao.hashCode());
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
		if (bancos != other.bancos)
			return false;
		if (exterior != other.exterior)
			return false;
		if (freios != other.freios)
			return false;
		if (interior != other.interior)
			return false;
		if (motor != other.motor)
			return false;
		if (pneus != other.pneus)
			return false;
		if (suspensao != other.suspensao)
			return false;
		return true;
	}


}
