package br.com.automag.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import br.com.automag.paiter.core.entity.PersistEntity;
import br.com.automag.paiter.dominio.DominioSimNao.DOMINIO_SIM_NAO;

@Entity
@SequenceGenerator(name="marca_seq", sequenceName = "marca_seq", allocationSize = 1)
public class Marca implements PersistEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
	private Long idMarca;
	
	@NotNull
	private String nome;
	

	private ImagemGenerica logomarca;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Version
	private Integer version;
	
	@Override
	public Long getId() {
		return idMarca;
	}

	@Override
	public DOMINIO_SIM_NAO getRemovido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRemovido(DOMINIO_SIM_NAO removido) {
		// TODO Auto-generated method stub
	}

}
