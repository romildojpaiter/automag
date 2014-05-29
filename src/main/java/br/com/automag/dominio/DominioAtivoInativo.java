package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.automag.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioAtivoInativo {
	
	public enum DOMINIO_ATIVO_INATIVO implements BaseDominioInterface<DOMINIO_ATIVO_INATIVO> {
		
		ATIVO("Ativo"), 
		INATIVO("Inativo");

		private String descricao;
		private String longDesc;

		DOMINIO_ATIVO_INATIVO(String desc) {
			this.descricao = desc;
			this.longDesc = desc;
		}

		DOMINIO_ATIVO_INATIVO(String desc, String longDesc) {
			this.descricao = desc;
			this.longDesc = longDesc;
		}

		public DOMINIO_ATIVO_INATIVO valueOf(int ord) {
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

