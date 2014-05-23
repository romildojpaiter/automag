package br.com.automag.entity.old;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@SequenceGenerator(name="marca_seq", sequenceName = "marca_seq", allocationSize = 1)
public class Marca implements BasePersistEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
	private Long idMarca;
	
	@NotNull
	private String nome;

	@ManyToOne
	@JoinColumn(name="idimagem")
	private ImagemGenerica logomarca;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Version
	private Integer version;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO removido;
	
	@Override
	public Long getId() {
		return idMarca;
	}

	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		return this.removido;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		this.removido = removido;
	}

	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ImagemGenerica getLogomarca() {
		return logomarca;
	}

	public void setLogomarca(ImagemGenerica logomarca) {
		this.logomarca = logomarca;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
