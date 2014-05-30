package br.com.automag.entity.deprecated.clientes;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.com.automag.paiter.core.entity.BasePersistEntity;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Cliente extends BasePersistEntity<Long> {

	@NotNull
	private String nome;

	@NotNull
	private String login;

	@NotNull
	private String password;

	@Transient
	private String temporalPassword;

	@Email
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cliente_telefone")
	private ArrayList<Telefone> telefones;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cliente_endereco")
	private ArrayList<Endereco> enderecos;


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
