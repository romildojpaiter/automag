package br.com.automag.paiter.dominio;

import br.com.automag.paiter.core.utils.BaseDominioInterface;

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
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer getOrdinal() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDesc() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer getSize() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isValido(int cdItemDominio) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public DOMINIO_ROLE_USER valueOf(int ord) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
