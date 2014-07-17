package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioTipoCombustivel {
	
	public enum DOMINIO_TIPO_COMBUSTIVEL implements BaseDominioInterface<DOMINIO_TIPO_COMBUSTIVEL>{
		
		
		DIESEL("Diesel"),
		GASOLINA("Gasolina"),
		ALCOOL("Alcool"),
		FLEX("Flex"),
		HIBRIDO("Hibrido"),
		TETRAFUEL("Tetrafuel"),
		GASOLINA_E_GAS("Gasolina e Gás");
		
		public String descricao;
		public String longDesc;
		
		DOMINIO_TIPO_COMBUSTIVEL(String desc) {
			this.descricao = desc;
			this.longDesc = desc;
		}
		
		DOMINIO_TIPO_COMBUSTIVEL(String desc, String longDesc) {
			this.descricao = desc;
			this.longDesc = longDesc;
		}

		public String getLongDesc() {
			return (StringUtils.isBlank(this.longDesc)) ? this.descricao : this.longDesc;
		}

		public Integer getOrdinal() {
			return this.ordinal();
		}

		public String getName() {
			return this.name();
		}

		public String getDesc() {
			return this.descricao;
		}

		public Integer getSize() {
			return values().length;
		}

		public boolean isValido(int cdItemDominio) {
			return (getSize() >= cdItemDominio) ? true : false;
		}

		public DOMINIO_TIPO_COMBUSTIVEL valueOf(int ord) {
			return values()[ord];
		}
		
	}

}
