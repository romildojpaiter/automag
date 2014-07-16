package br.com.automag.paiter.dominio;

import br.com.paiter.core.utils.dominio.BaseDominioInterface;

public class DominioItemOpcional {
	
	public enum DOMINIO_ITEM_OPCIONAL implements BaseDominioInterface<DOMINIO_ITEM_OPCIONAL>{
		
		AR_CONDICIONADO("AR","Ar Condiciónado"),
		AR_QUENTE("AQ","Ar quente"),
		DIRECAO_HIDRAULICA("DH","Direção hidráulica"),
		VIDRO_ELETRICO("VE","Vídro elétrico"),
		BANCO_DE_COURO("BC","Banco de couro"),
		FAROL_DE_MILHA("FM","Farol de milha"),
		FAROL_DE_NEBLINA("FN","Farol de neblina"),
		CAMBIO_AUTOMATICO("CA","Cámbio Automático"),
		CAMBIO_AUTOMATIZADO("CZ","Cámbio Automátizado"),
		BLUETOOTH("BL","Bluetooth"),
		RODAS_LIGA_LEVE("RLL","Rodas de liga leve"),
		AIRBAG("AIR","Airbag"),
		AIRBAG_DUPLO("AIRD","Airbag Duplo"),
		FREIOS_ABS("ABS","Freios ABS"),
		TRAVA_ELETRICA("TE","Trava elétrica"),
		CONJUNTO_DE_SOM("CS","Conjunto de som"),
		CD_PLAYER("CDP","CD Player"),
		DVD_PLAYER("DVD","DVD Player"),
		MP3_PLAYER("MP3","MP3 Player"),
		SENSOR_DE_ESTACIONAMENTO("SE","Sensor de estacionamento"),
		TRACAO_4X4("4X4","Tração 4x4"),
		DESEMBACADOR_TRASEIRO("DT","Desembaçador traseiro"),
		LIMPADOR_TRASEIRO("LT","Limpador traseiro"),
		KIT_MULTIMIDIA("KIT","Kit Multimídia"),
		CAPOTA_MARITIMA("CM","Capota marítima"),
		COMPUTADOR_DE_BORDO("CB","Computador de bordo"),
		PROTETOR_DE_CACAMBA("PC","Protetor de caçamba"),
		SENSOR_DE_CHUVA("SC","Sensor de chuva"),
		AUTO_ESTACIONAMENTO("AE","Auto estacionamento"),
		RETROVISOR_ELETRICO("RE","Retrovisor eletrico"),
		RETROVISOR_RETRATIL("RR","Retrovisor retratil"),
		ALARME("AL","Alarme"),
		GPS("GPS","GPS"),
		RADIO("RA","Rádio"),
		ENCONSTO_DE_CABECA_TRASEIRO("ECT","Enconsto de cabeça tras"),
		BANCO_MOTORISTA_COM_AJUSTE_DE_AUTURA("BMR","Banco do motorista com ajuste de autura"),
		VOLANTE_COM_REGULAGEM_DE_AUTURA("VRA","Volante com regulagem de autura"),
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
