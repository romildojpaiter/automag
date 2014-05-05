package br.com.automag.paiter.dominio;

import br.com.automag.paiter.core.utils.BaseDominioInterface;

public class DominioTipoCombustivel {
	
	public enum DOMINIO_TIPO_COMBUSTIVEL implements BaseDominioInterface<DOMINIO_TIPO_COMBUSTIVEL>{
		
		
		DIESEL("Diesel"),
		GASOLINA("Gasolina"),
		ALCOOL("Alcool"),
		FLEX("Flex"),
		HIBRIDO("Hibrido"),
		TETRAFUEL("Tetrafuel"),
		GASOLINA_E_GAS("Gasolina e Gás");
		
		public String desc;
		public String longDesc;
		
		DOMINIO_TIPO_COMBUSTIVEL(String desc) {
			this.desc = desc;
			this.longDesc = desc;
		}
		
		DOMINIO_TIPO_COMBUSTIVEL(String desc, String longDesc) {
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
		public DOMINIO_TIPO_COMBUSTIVEL valueOf(int ord) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
