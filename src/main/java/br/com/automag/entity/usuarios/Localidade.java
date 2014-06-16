package br.com.automag.entity.usuarios;

import java.util.Set;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ListIndexBase;
import org.hibernate.annotations.Where;

import br.com.automag.dominio.DominioEstado.DOMINIO_ESTADO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="localidade_seq",sequenceName="localidade_seq",allocationSize=1)
public class Localidade extends BasePersistEntity{
	
	@Id
	@GeneratedValue(generator="localidade_seq", strategy=GenerationType.SEQUENCE)
	private Long id;	

	@Column(nullable=false)
	private String municipio;

	@Enumerated(EnumType.STRING)
	private DOMINIO_ESTADO estado;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@ListIndexBase(value=1)
	@JoinTable(name = "localidade_clientes", 
		joinColumns = @JoinColumn(name = "idLocalidade"), 
		inverseJoinColumns = @JoinColumn(name = "idClientes", unique = false))
	private Set<Cliente> clientes;

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public DOMINIO_ESTADO getEstado() {
		return estado;
	}

	public void setEstado(DOMINIO_ESTADO estado) {
		this.estado = estado;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Localidade other = (Localidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
