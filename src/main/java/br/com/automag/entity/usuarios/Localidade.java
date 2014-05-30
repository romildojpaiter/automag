package br.com.automag.entity.usuarios;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.automag.dominio.DominioEstado.DOMINIO_ESTADO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Localidade extends BasePersistEntity<Long> {

	@Column(nullable=false)
	private String municipio;

	@Enumerated(EnumType.STRING)
	private DOMINIO_ESTADO estado;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((municipio == null) ? 0 : municipio.hashCode());
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
		if (estado != other.estado)
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		return true;
	}
	
	

}
