package br.com.automag.paiter.dominio;

import br.com.automag.paiter.core.utils.BaseDominioInterface;

public class DominioItemOpcional {
	
	public enum DOMINIO_ITEM_OPCIONAL implements BaseDominioInterface<DOMINIO_ITEM_OPCIONAL>{
		
		//TODO: Adicionar os Itens Opcionais.
		;
		
		private String desc;
		private String longDesc;
		
		DOMINIO_ITEM_OPCIONAL(String desc) {
			this.desc = desc;
			this.longDesc = desc;
		}

		DOMINIO_ITEM_OPCIONAL(String desc, String longDesc) {
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
		public DOMINIO_ITEM_OPCIONAL valueOf(int ord) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
