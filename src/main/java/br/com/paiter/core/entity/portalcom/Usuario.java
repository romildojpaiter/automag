package br.com.paiter.core.entity.portalcom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import br.com.automag.dominio.DominioPerfilUsuario.DOMINIO_PERFIL_USUARIO;
import br.com.paiter.core.entity.BasePersistEntity;

@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="usuario_seq",sequenceName="usuario_seq",allocationSize=1)
@NamedQueries({
	@NamedQuery(
			name="findByEmail",
			query="SELECT usuario FROM Usuario usuario WHERE usuario.email LIKE :email"),
	@NamedQuery(
			name="findByLogin",
			query="SELECT usuario FROM Usuario usuario WHERE usuario.login LIKE :login")
})
public class Usuario extends BasePersistEntity {

	@Id
	@GeneratedValue(generator="usuario_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@NotNull
	private String nome;

	@Email
	@NotEmpty
	@Column(nullable=false, unique=true)
	private String email;

	@NotEmpty
	@Column(unique=true, nullable=false, updatable=false)
	private String login;

	@NotNull
	private String password;

	@Transient
	private String passwordTemp;

	@Enumerated(EnumType.STRING)
	private DOMINIO_PERFIL_USUARIO perfil;

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

	public DOMINIO_PERFIL_USUARIO getPerfil() {
		return perfil;
	}

	public void setPerfil(DOMINIO_PERFIL_USUARIO perfil) {
		this.perfil = perfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPasswordTemp() {
		return passwordTemp;
	}

	public void setPasswordTemp(String passwordTemp) {
		this.passwordTemp = passwordTemp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((passwordTemp == null) ? 0 : passwordTemp.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
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
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (passwordTemp == null) {
			if (other.passwordTemp != null)
				return false;
		} else if (!passwordTemp.equals(other.passwordTemp))
			return false;
		if (perfil != other.perfil)
			return false;
		return true;
	}
	
	public String getDataCadastroFormatado(){
		DateTime dateTime = new DateTime(this.getDataCadastro());
		return dateTime.getYear() + "-" +dateTime.getMonthOfYear() + "-" + dateTime.getDayOfMonth();
	}

}
