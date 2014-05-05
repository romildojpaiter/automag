package br.com.automag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import br.com.automag.paiter.core.entity.PersistEntity;

@Entity
@SequenceGenerator(name="marca_seq", sequenceName = "marca_seq", allocationSize = 1)
public class Marca implements PersistEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
	public Long idMarca;
	
	@NotNull
	public String nome;
	
	@Version
	public Integer version;
	
	
	@Override
	public Long getId() {
		return idMarca;
	}

}
