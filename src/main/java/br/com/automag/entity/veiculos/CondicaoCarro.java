package br.com.automag.entity.veiculos;

import br.com.automag.dominio.DominioTipoCondicao.DOMINIO_TIPO_CONDICAO;

public class CondicaoCarro {

	private DOMINIO_TIPO_CONDICAO pneus;

	private DOMINIO_TIPO_CONDICAO interior;

	private DOMINIO_TIPO_CONDICAO exterior;

	private DOMINIO_TIPO_CONDICAO motor;

	private DOMINIO_TIPO_CONDICAO freios;

	private DOMINIO_TIPO_CONDICAO suspensao;

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

}
