package br.com.automag.utils;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import br.com.automag.dominio.DominioMotorizacao.DOMINIO_MOTORIZACAO;
import br.com.automag.dominio.DominioQuantidadePortas.DOMINIO_QTD_PORTAS;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.dominio.DominioTipoCombustivel.DOMINIO_TIPO_COMBUSTIVEL;
import br.com.automag.dominio.DominioTipoCondicao.DOMINIO_TIPO_CONDICAO;
import br.com.automag.dominio.DominioTipoVeiculo.DOMINIO_TIPO_VEICULO;

@Named("comboBoxesAutonetmag")
public class ComboBoxesAutonetmag {
	
	@Produces
	public DOMINIO_TIPO_CONDICAO[] getComboBoxDominioTipoCondicao(){
		return DOMINIO_TIPO_CONDICAO.values();
	}

	@Produces
	public DOMINIO_SIM_NAO[] getComboBoxDominioSimNao(){
		return DOMINIO_SIM_NAO.values();
	}
	
	@Produces
	public DOMINIO_TIPO_COMBUSTIVEL[] getComboBoxDominioTipoCombustivel(){
		return DOMINIO_TIPO_COMBUSTIVEL.values();
	}
	
	@Produces
	public DOMINIO_MOTORIZACAO[] getComboBoxDominioTipoMotorizacao(){
		return DOMINIO_MOTORIZACAO.values();
	}
	
	@Produces
	public DOMINIO_QTD_PORTAS[] getComboBoxDominioQtdPortas(){
		return DOMINIO_QTD_PORTAS.values();
	}
	
	@Produces
	public DOMINIO_TIPO_VEICULO[] getComboBoxDominioTipoVeiculo(){
		return DOMINIO_TIPO_VEICULO.values();
	}
	
	
}
