package br.com.automag.entity.usuarios;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ListIndexBase;
import org.hibernate.validator.constraints.Email;

import br.com.automag.dominio.DominioSexo.DOMINIO_SEXO;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.entity.personalcar.PedidoServico;
import br.com.automag.paiter.core.entity.BasePersistEntity;

@Entity
public class Pessoa extends BasePersistEntity<Long> {

	@NotNull
	private String nome;

	@Email
	@NotNull
	private String email;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SEXO sexo;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@NotNull
	private String documentoCPF;

	@NotNull
	private String registroGeral;

	@Temporal(TemporalType.DATE)
	private Date dataEmissaoRG;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO aceitaReceberEmail;

	@Enumerated(EnumType.STRING)
	private DOMINIO_SIM_NAO concordaTermosDeUso;

	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
	@ListIndexBase(value=1)
	@JoinTable(name = "pessoa_pedidoservicos", 
		joinColumns = @JoinColumn(name = "idPessoa"), 
		inverseJoinColumns = @JoinColumn(name = "idPedidoServico", unique = false))
	private List<PedidoServico> pedidosDeServicos;

	@OneToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

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

	public DOMINIO_SEXO getSexo() {
		return sexo;
	}

	public void setSexo(DOMINIO_SEXO sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDocumentoCPF() {
		return documentoCPF;
	}

	public void setDocumentoCPF(String documentoCPF) {
		this.documentoCPF = documentoCPF;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public Date getDataEmissaoRG() {
		return dataEmissaoRG;
	}

	public void setDataEmissaoRG(Date dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}

	public DOMINIO_SIM_NAO getAceitaReceberEmail() {
		return aceitaReceberEmail;
	}

	public void setAceitaReceberEmail(DOMINIO_SIM_NAO aceitaReceberEmail) {
		this.aceitaReceberEmail = aceitaReceberEmail;
	}

	public DOMINIO_SIM_NAO getConcordaTermosDeUso() {
		return concordaTermosDeUso;
	}

	public void setConcordaTermosDeUso(DOMINIO_SIM_NAO concordaTermosDeUso) {
		this.concordaTermosDeUso = concordaTermosDeUso;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((aceitaReceberEmail == null) ? 0 : aceitaReceberEmail
						.hashCode());
		result = prime
				* result
				+ ((concordaTermosDeUso == null) ? 0 : concordaTermosDeUso
						.hashCode());
		result = prime * result
				+ ((dataEmissaoRG == null) ? 0 : dataEmissaoRG.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((documentoCPF == null) ? 0 : documentoCPF.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((registroGeral == null) ? 0 : registroGeral.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		if (aceitaReceberEmail != other.aceitaReceberEmail)
			return false;
		if (concordaTermosDeUso != other.concordaTermosDeUso)
			return false;
		if (dataEmissaoRG == null) {
			if (other.dataEmissaoRG != null)
				return false;
		} else if (!dataEmissaoRG.equals(other.dataEmissaoRG))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (documentoCPF == null) {
			if (other.documentoCPF != null)
				return false;
		} else if (!documentoCPF.equals(other.documentoCPF))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	public List<PedidoServico> getPedidosDeServicos() {
		return pedidosDeServicos;
	}

	public void setPedidosDeServicos(List<PedidoServico> pedidosDeServicos) {
		this.pedidosDeServicos = pedidosDeServicos;
	}
	
	

}
