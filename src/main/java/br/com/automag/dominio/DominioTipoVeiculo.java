package br.com.automag.dominio;

import org.apache.commons.lang.StringUtils;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioTipoVeiculo {
	
	public enum DOMINIO_TIPO_VEICULO implements BaseDominioInterface<DOMINIO_TIPO_VEICULO>{
		
		MOTO("Moto"),
		CARRO("Carro"),
		CAMINHONETA("Caminhoneta"),
		CAMINHAO("Caminhão"),
		CARRETA("CARRETA");
		
		private String desc;
		private String longDesc;
		
		DOMINIO_TIPO_VEICULO(String desc){
			this.desc = desc;
			this.longDesc = desc;
		}
		
		DOMINIO_TIPO_VEICULO(String desc, String longDesc) {
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
		public DOMINIO_TIPO_VEICULO valueOf(int ord) {
			return values()[ord];
		}
		
	}

}
