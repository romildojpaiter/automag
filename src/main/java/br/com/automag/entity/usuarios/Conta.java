package br.com.automag.entity.usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="conta_seq",sequenceName="conta_seq",allocationSize=1)
public class Conta extends BasePersistEntity {
	
	@Id
	@GeneratedValue(generator="conta_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(unique=true, updatable=false, nullable=false)
	private String login;

	@NotNull
	private String password;

	@Transient
	private String temporalPassword;
	
	@OneToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	public static final Conta GHOST;
	
	static {
		GHOST = new Conta("", "");
		GHOST.setId(1000l);
	}	
	
	public Conta(){
	}
	
	public Conta(String login, String password){
		this.login = login;
		this.password = password;
	}
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTemporalPassword() {
		return temporalPassword;
	}

	public void setTemporalPassword(String temporalPassword) {
		this.temporalPassword = temporalPassword;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
