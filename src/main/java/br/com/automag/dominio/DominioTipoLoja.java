package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioTipoLoja {
	
	public enum DOMINIO_TIPO_LOJA implements BaseDominioInterface<DOMINIO_TIPO_LOJA> {
		
		DIAMANTE("Diamante"), 
		PLANINUM("Plantinum"), 
		OURO("Ouro"), 
		PRATA("Prata"), 
		BRONZE("Bronze"), 
		COMUM("Comum");

		private String descricao;
		private String longDesc;

		DOMINIO_TIPO_LOJA(String desc) {
			this.descricao = desc;
			this.longDesc = desc;
		}

		DOMINIO_TIPO_LOJA(String desc, String longDesc) {
			this.descricao = desc;
			this.longDesc = longDesc;
		}

		public DOMINIO_TIPO_LOJA valueOf(int ord) {
			return values()[ord];
		}

		public String toString() {
			return this.getName();
		}

		public String getLongDesc() {
			return (StringUtils.isBlank(this.longDesc)) ? this.descricao : this.longDesc;
		}

		public Integer getSize() {
			return values().length;
		}

		public boolean isValido(int cdItemDominio) {
			return (getSize() >= cdItemDominio) ? true : false;
		}

		public Integer getOrdinal() {
			return this.ordinal();
		}

		public String getDesc() {
			return this.descricao;
		}

		public String getName() {
			return this.name();
		}
		
	}

}

