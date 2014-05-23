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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Carro extends BasePersistEntity<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
	private Long idCarro;
	
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
	public Long getId() {
		return idCarro;
	}

	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		return removido;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		this.removido = removido;
	}

	
}
