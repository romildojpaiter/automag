package br.com.automag.entity.clientes;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Cliente extends BasePersistEntity<Long> {

	private String nome;

	private String login;

	private String password;

	private String temporalPassword;

	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
