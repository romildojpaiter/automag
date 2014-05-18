package br.com.automag.paiter.core.entity;

import br.com.automag.paiter.dominio.DominioSimNao.DOMINIO_SIM_NAO;


public interface PersistEntity {
	
	public Long getId();
	
	public DOMINIO_SIM_NAO getRemovido();
	
	public void setRemovido(DOMINIO_SIM_NAO removido);
}
