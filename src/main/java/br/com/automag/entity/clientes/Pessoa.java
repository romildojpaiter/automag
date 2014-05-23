package br.com.automag.entity.clientes;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
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

	
	
}
