package br.com.automag.entity.clientes;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.entity.servicos.PedidoServico;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@MappedSuperclass
public class Pessoa extends BasePersistEntity<Long> {

	@NotNull
	private String nome;

	@Email
	private String email;

	@NotNull
	private String password;

	@NotNull
	private String login;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO concordaTermosDeUso;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO aceitaReceberEmail;

	@OneToMany
	private Set<PedidoServico> pedidosDeServicos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
