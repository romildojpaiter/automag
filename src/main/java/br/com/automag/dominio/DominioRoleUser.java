package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.automag.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioRoleUser {

	public enum DOMINIO_ROLE_USER implements BaseDominioInterface<DOMINIO_ROLE_USER>{
		
		ANONIMO("Anônimo"), 
		ADMIN("Administrador"), 
		STANDARD("Padrão"), 
		MANAGER("Gerente"), 
		USER("Usuário"), 
		DIRECTOR("Diretor");

		private String desc;
		private String longDesc;
		
		DOMINIO_ROLE_USER(String desc){
			this.desc = desc;
			this.longDesc = desc;
		}

		DOMINIO_ROLE_USER(String desc, String longDesc){
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
			return this.name();
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
		public DOMINIO_ROLE_USER valueOf(int ord) {
			return values()[ord];
		}
		
	}
}
