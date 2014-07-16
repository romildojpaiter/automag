package br.com.automag.entity.veiculos;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.ListIndexBase;
import org.hibernate.annotations.Where;

import br.com.automag.dominio.DominioMotorizacao.DOMINIO_MOTORIZACAO;
import br.com.automag.dominio.DominioQuantidadePortas.DOMINIO_QTD_PORTAS;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.dominio.DominioTipoCombustivel.DOMINIO_TIPO_COMBUSTIVEL;
import br.com.automag.dominio.DominioTipoVeiculo.DOMINIO_TIPO_VEICULO;
import br.com.automag.entity.arquivos.Imagem;
import br.com.automag.entity.usuarios.Cliente;
import br.com.paiter.core.entity.BasePersistEntity;

@Data
@EqualsAndHashCode(of={"id"}, callSuper=false)
@NoArgsConstructor
@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="veiculo_seq",sequenceName="veiculo_seq",allocationSize=1)
public class Veiculo extends BasePersistEntity {
	
	@Id
	@GeneratedValue(generator="veiculo_seq", strategy=GenerationType.SEQUENCE)
	private Long id;	
	
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
	@Column(name="preco", precision=15, scale=2)
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
	private DOMINIO_SIM_NAO valorNegociavel;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_QTD_PORTAS portas;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_COMBUSTIVEL tipoCombustivel;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_VEICULO tipoVeiculo;
	
	@Enumerated(EnumType.STRING)
	private DOMINIO_MOTORIZACAO motorizacao;
	
	/*
	 * Informações de Publicações
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPublicacao;

	@NotNull
	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO publicado;
	
	/**
	 *  Funcionalidades
	 */
	
	public void exibirIcones() {

	}

	

}
