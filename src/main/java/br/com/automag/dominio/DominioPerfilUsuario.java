package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioPerfilUsuario {
	
	public enum DOMINIO_PERFIL_USUARIO implements BaseDominioInterface<DOMINIO_PERFIL_USUARIO> {
		
		ADMINISTRADOR("Administrador"), 
		FUNCIONARIO("Funcionario"),
		CLIENTE("Clientes");

		private String descricao;
		private String longDesc;

		DOMINIO_PERFIL_USUARIO(String desc) {
			this.descricao = desc;
			this.longDesc = desc;
		}

		DOMINIO_PERFIL_USUARIO(String desc, String longDesc) {
			this.descricao = desc;
			this.longDesc = longDesc;
		}

		public DOMINIO_PERFIL_USUARIO valueOf(int ord) {
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

