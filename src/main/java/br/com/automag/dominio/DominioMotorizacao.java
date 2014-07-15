package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioMotorizacao {
	
	public enum DOMINIO_MOTORIZACAO implements BaseDominioInterface<DOMINIO_MOTORIZACAO> {
		
		UM_PONTO_ZERO("1.0"), 
		UM_PONTO_TRES("1.3"), 
		UM_PONTO_QUATRO("1.4"),
		UM_PONTO_SEIS("1.6"),
		DOIS_PONTO_ZERO("2.0"),
		DOIS_PONTO_OITO("2.8"),
		NAO_INFORMADO("Não informado")
		;

		private String descricao;
		private String longDesc;

		DOMINIO_MOTORIZACAO(String desc) {
			this.descricao = desc;
			this.longDesc = desc;
		}

		DOMINIO_MOTORIZACAO(String desc, String longDesc) {
			this.descricao = desc;
			this.longDesc = longDesc;
		}

		public DOMINIO_MOTORIZACAO valueOf(int ord) {
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

