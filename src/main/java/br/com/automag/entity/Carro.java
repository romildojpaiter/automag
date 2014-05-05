package br.com.automag.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.management.relation.Role;
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

import br.com.automag.paiter.core.entity.PersistEntity;
import br.com.automag.paiter.dominio.DominioItemOpcional.DOMINIO_ITEM_OPCIONAL;
import br.com.automag.paiter.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.paiter.dominio.DominioTipoCombustivel.DOMINIO_TIPO_COMBUSTIVEL;
import br.com.automag.paiter.dominio.DominioTipoVeiculo.DOMINIO_TIPO_VEICULO;

@Entity
@SequenceGenerator(name="carro_seq", sequenceName = "carro_seq", allocationSize = 1)
public class Carro implements PersistEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
	public Long idCarro;
	
	@NotNull
	public String modelo;
	
	@NotNull(message="Informe o preço do veículo")
	public Long preco;
	
	@Enumerated(EnumType.STRING)
	public DOMINIO_TIPO_VEICULO tipoVeiculo;
	
	@ManyToOne
	@JoinColumn(name="idmarca",
		insertable=true,
		nullable=false)
	@NotNull(message="Informe a marca do veículo")
	public Marca marca;
	
	@NotNull
	public String anoFabricacao;
	
	@NotNull
	public String anoModelo;
	
	@NotNull
	public String cor;
	
	public String finalPlaca;
	
	public String quilometragem;
	
	@Enumerated(EnumType.STRING)
	public DOMINIO_TIPO_COMBUSTIVEL combustivel;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	public DOMINIO_SIM_NAO publicado;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date dataPublicacao;
	
	@OneToMany
	@JoinTable(name="carro_imagem",
		joinColumns= @JoinColumn(name="idCarro"),
		inverseJoinColumns= @JoinColumn(name="idImagem")) 
	@OrderBy(value="idImagem ASC")
	public List<Imagem> imagens;
	
	@ElementCollection(targetClass=DOMINIO_ITEM_OPCIONAL.class, fetch=FetchType.EAGER)
    @Enumerated(EnumType.STRING) // Possibly optional (I'm not sure) but defaults to ORDINAL.
    @CollectionTable(name="carro_itemopcional")
    @Column(name="itemopcional") 	
	public Set<DOMINIO_ITEM_OPCIONAL> itensOpcionais;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date dataCadastro;

	@Column(columnDefinition="TEXT")
	public String observacao;
	
	@Version
	public Integer version;
	
	@Override
	public Long getId() {
		return idCarro;
	}

	
}
