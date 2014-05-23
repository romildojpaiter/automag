package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.automag.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioTipoDocumento {

	public enum DOMINIO_TIPO_DOCUMENTO implements BaseDominioInterface<DOMINIO_TIPO_DOCUMENTO>{
		
		CPF("Pessoa Física"),
		CNPJ("Pessoa Júridica");
		
		private String desc;
		private String longDesc;
		
		
		DOMINIO_TIPO_DOCUMENTO(String desc){
			this.desc = desc;
			this.longDesc = desc;
		}

		DOMINIO_TIPO_DOCUMENTO(String desc, String longDesc){
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
			return this.desc;
		}

		@Override
		public Integer getSize() {
			return values().length;
		}

		@Override
		public boolean isValido(int cdItemDominio) {
			return (getSize() >= cdItemDominio) ? true : false;
		}

		@Override
		public DOMINIO_TIPO_DOCUMENTO valueOf(int ord) {
			return values()[ord];
		}
		
	}
}
