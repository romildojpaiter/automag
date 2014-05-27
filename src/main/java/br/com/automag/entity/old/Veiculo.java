package br.com.automag.entity.old;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioItemOpcional.DOMINIO_ITEM_OPCIONAL;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.dominio.DominioTipoCombustivel.DOMINIO_TIPO_COMBUSTIVEL;
import br.com.automag.dominio.DominioTipoVeiculo.DOMINIO_TIPO_VEICULO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="carro_seq", sequenceName = "carro_seq", allocationSize = 1)
public class Veiculo extends BasePersistEntity<Long> {

	@NotNull
	private String modelo;
	
	@NotNull(message="Informe o preço do veículo")
	private Long preco;
	
	@ManyToOne
	@JoinColumn(name="loja_id")
	private Loja loja;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_VEICULO tipoVeiculo;
	
	@ManyToOne
	@JoinColumn(name="idmarca",
		insertable=true,
		nullable=false)
	@NotNull(message="Informe a marca do veículo")
	private Marca marca;
	
	@NotNull
	private String anoFabricacao;
	
	@NotNull
	private String anoModelo;
	
	@NotNull
	private String cor;
	
	private String finalPlaca;
	
	private String quilometragem;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_COMBUSTIVEL combustivel;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private DOMINIO_SIM_NAO publicado;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPublicacao;
	
	@OneToMany
	@JoinTable(name="carro_imagem",
		joinColumns= @JoinColumn(name="idCarro"),
		inverseJoinColumns= @JoinColumn(name="idImagem")) 
	@OrderBy(value="idImagem ASC")
	private List<Imagem> imagens;
	
	@ElementCollection(targetClass=DOMINIO_ITEM_OPCIONAL.class, fetch=FetchType.EAGER)
    @Enumerated(EnumType.STRING) // Possibly optional (I'm not sure) but defaults to ORDINAL.
    @CollectionTable(name="carro_itemopcional")
    @Column(name="itemopcional") 	
	private Set<DOMINIO_ITEM_OPCIONAL> itensOpcionais;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date dataCadastro;

	@Column(columnDefinition="TEXT")
	private String observacao;
	
	@Version
	private Integer version;

	@Enumerated(EnumType.STRING)
	@NotNull
	private DOMINIO_SIM_NAO removido;
	
	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		return removido;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		this.removido = removido;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public DOMINIO_TIPO_COMBUSTIVEL getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(DOMINIO_TIPO_COMBUSTIVEL combustivel) {
		this.combustivel = combustivel;
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
				+ ((combustivel == null) ? 0 : combustivel.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result
				+ ((removido == null) ? 0 : removido.hashCode());
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
		if (combustivel != other.combustivel)
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
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
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (removido != other.removido)
			return false;
		return true;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public DOMINIO_TIPO_VEICULO getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(DOMINIO_TIPO_VEICULO tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
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

	public DOMINIO_SIM_NAO getPublicado() {
		return publicado;
	}

	public void setPublicado(DOMINIO_SIM_NAO publicado) {
		this.publicado = publicado;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public Set<DOMINIO_ITEM_OPCIONAL> getItensOpcionais() {
		return itensOpcionais;
	}

	public void setItensOpcionais(Set<DOMINIO_ITEM_OPCIONAL> itensOpcionais) {
		this.itensOpcionais = itensOpcionais;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	
}
