package br.com.automag.entity.veiculos;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ListIndexBase;

import br.com.automag.dominio.DominioMotorizacao.DOMINIO_MOTORIZACAO;
import br.com.automag.dominio.DominioQuantidadePortas.DOMINIO_QTD_PORTAS;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.dominio.DominioTipoCombustivel.DOMINIO_TIPO_COMBUSTIVEL;
import br.com.automag.entity.arquivos.Imagem;
import br.com.automag.entity.usuarios.Cliente;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="veiculo_seq",sequenceName="veiculo_seq",allocationSize=1)
public class Veiculo extends BasePersistEntity<Long> {
	
	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="modelo_id")
	private Modelo modelo;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@NotNull(message="Informe o preço do veículo")
	private BigDecimal preco;

	@NotNull
	private String anoFabricacao;

	@NotNull
	private String anoModelo;

	private String finalPlaca;

	private String quilometragem;

	@Column(columnDefinition="TEXT")
	private String observacao;


	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "veiculo_itensopcionais", 
		joinColumns = @JoinColumn(name = "idVeiculo"), 
		inverseJoinColumns = @JoinColumn(name = "idItemOpcional", unique = false))
	private List<ItemOpcional> itensOpcionais;

	@OneToOne
	@JoinColumn(name="idCondicaoVeiculo")
	private CondicaoVeiculo condicaoVeiculo;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "veiculo_imagens", 
		joinColumns = @JoinColumn(name = "idVeiculo"), 
		inverseJoinColumns = @JoinColumn(name = "idImagem", unique = false))	
	private List<Imagem> imagens;

	@ManyToOne
	@JoinColumn(name="cor_id")
	private Cor cor;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO certificado;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_QTD_PORTAS portas;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_COMBUSTIVEL tipoCombustivel;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_QTD_PORTAS tipoVeiculo;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_MOTORIZACAO motorizacao;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_COMBUSTIVEL combustivel;
	
	/*
	 * Informações de Publicações
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPublicacao;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO publicado;
	
	
	public void exibirIcones() {

	}

	public Integer getQuantidadeAcessos() {
		return null;
	}

	public String getMetadataVeiculo() {
		return null;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}


	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getFinalPlaca() {
		return finalPlaca;
	}

	public void setFinalPlaca(String finalPlaca) {
		this.finalPlaca = finalPlaca;
	}

	public String getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CondicaoVeiculo getCondicaoVeiculo() {
		return condicaoVeiculo;
	}

	public void setCondicaoVeiculo(CondicaoVeiculo condicaoCarro) {
		this.condicaoVeiculo = condicaoCarro;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public DOMINIO_SIM_NAO getCertificado() {
		return certificado;
	}

	public void setCertificado(DOMINIO_SIM_NAO certificado) {
		this.certificado = certificado;
	}

	public DOMINIO_QTD_PORTAS getPortas() {
		return portas;
	}

	public void setPortas(DOMINIO_QTD_PORTAS portas) {
		this.portas = portas;
	}

	public DOMINIO_TIPO_COMBUSTIVEL getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(DOMINIO_TIPO_COMBUSTIVEL tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public DOMINIO_QTD_PORTAS getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(DOMINIO_QTD_PORTAS tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public DOMINIO_MOTORIZACAO getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(DOMINIO_MOTORIZACAO motorizacao) {
		this.motorizacao = motorizacao;
	}

	public DOMINIO_TIPO_COMBUSTIVEL getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(DOMINIO_TIPO_COMBUSTIVEL combustivel) {
		this.combustivel = combustivel;
	}

	public DOMINIO_SIM_NAO getPublicado() {
		return publicado;
	}

	public void setPublicado(DOMINIO_SIM_NAO publicado) {
		this.publicado = publicado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result
				+ ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result
				+ ((certificado == null) ? 0 : certificado.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result
				+ ((combustivel == null) ? 0 : combustivel.hashCode());
		result = prime * result
				+ ((condicaoVeiculo == null) ? 0 : condicaoVeiculo.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result
				+ ((dataPublicacao == null) ? 0 : dataPublicacao.hashCode());
		result = prime * result
				+ ((finalPlaca == null) ? 0 : finalPlaca.hashCode());
		result = prime * result + ((imagens == null) ? 0 : imagens.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result
				+ ((motorizacao == null) ? 0 : motorizacao.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((portas == null) ? 0 : portas.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result
				+ ((publicado == null) ? 0 : publicado.hashCode());
		result = prime * result
				+ ((quilometragem == null) ? 0 : quilometragem.hashCode());
		result = prime * result
				+ ((tipoCombustivel == null) ? 0 : tipoCombustivel.hashCode());
		result = prime * result
				+ ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (certificado != other.certificado)
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (combustivel != other.combustivel)
			return false;
		if (condicaoVeiculo == null) {
			if (other.condicaoVeiculo != null)
				return false;
		} else if (!condicaoVeiculo.equals(other.condicaoVeiculo))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (dataPublicacao == null) {
			if (other.dataPublicacao != null)
				return false;
		} else if (!dataPublicacao.equals(other.dataPublicacao))
			return false;
		if (finalPlaca == null) {
			if (other.finalPlaca != null)
				return false;
		} else if (!finalPlaca.equals(other.finalPlaca))
			return false;
		if (imagens == null) {
			if (other.imagens != null)
				return false;
		} else if (!imagens.equals(other.imagens))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (motorizacao != other.motorizacao)
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (portas != other.portas)
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (publicado != other.publicado)
			return false;
		if (quilometragem == null) {
			if (other.quilometragem != null)
				return false;
		} else if (!quilometragem.equals(other.quilometragem))
			return false;
		if (tipoCombustivel != other.tipoCombustivel)
			return false;
		if (tipoVeiculo != other.tipoVeiculo)
			return false;
		return true;
	}

	public List<ItemOpcional> getItensOpcionais() {
		return itensOpcionais;
	}

	public void setItensOpcionais(List<ItemOpcional> itensOpcionais) {
		this.itensOpcionais = itensOpcionais;
	}

	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

}
