package br.com.automag.entity.servico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="classificado_seq",sequenceName="classificado_seq",allocationSize=1)
public class Classificado extends BasePersistEntity {
	
	@Id
	@GeneratedValue(generator="classificado_seq", strategy=GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	private String titulo;

	@NotNull
	@Column(columnDefinition="TEXT")
	private String descricao;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO finalizado;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public DOMINIO_SIM_NAO getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(DOMINIO_SIM_NAO finalizado) {
		this.finalizado = finalizado;
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
		Classificado other = (Classificado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
