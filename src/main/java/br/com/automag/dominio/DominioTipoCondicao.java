package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioTipoCondicao {
	
	public enum DOMINIO_TIPO_CONDICAO implements BaseDominioInterface<DOMINIO_TIPO_CONDICAO> {
		
		RUIM("Ruim"),
		REGULAR("Regular"),
		BOM("Bom"),
		OTIMO("Ótimo"),
		EXCELENTE("Excelente");
		
		
		private String descricao;
		private String longDesc;

		DOMINIO_TIPO_CONDICAO(String desc) {
			this.descricao = desc;
			this.longDesc = desc;
		}

		DOMINIO_TIPO_CONDICAO(String desc, String longDesc) {
			this.descricao = desc;
			this.longDesc = longDesc;
		}

		public DOMINIO_TIPO_CONDICAO valueOf(int ord) {
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

