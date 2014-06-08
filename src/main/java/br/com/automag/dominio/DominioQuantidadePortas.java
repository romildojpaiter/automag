package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.automag.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioQuantidadePortas {
	
	public enum DOMINIO_QTD_PORTAS implements BaseDominioInterface<DOMINIO_QTD_PORTAS>{
		
		DUAS("2","Duas"),
		QUATRO("4","Quatro");
		
		private String desc;
		private String longDesc;
		
		DOMINIO_QTD_PORTAS(String desc){
			this.desc = desc;
			this.longDesc = desc;
		}
		
		DOMINIO_QTD_PORTAS(String desc, String longDesc) {
			this.desc = desc;
			this.longDesc = longDesc;
		}

		@Override
		public String getLongDesc() {
			return (StringUtils.isBlank(this.longDesc)) ? this.desc : this.longDesc;
		}

		@Override
		public Integer getOrdinal() {
			return this.getOrdinal();
		}

		@Override
		public String getName() {
			return this.getName();
		}

		@Override
		public String getDesc() {
			return this.getDesc();
		}

		@Override
		public Integer getSize() {
			return values().length;
		}

		@Override
		public boolean isValido(int cdItemDominio) {
			return (this.getSize() >= cdItemDominio) ? true : false;
		}

		@Override
		public DOMINIO_QTD_PORTAS valueOf(int ord) {
			return values()[ord];
		}
		
	}

}
