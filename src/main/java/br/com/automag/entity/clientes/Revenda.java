package br.com.automag.entity.clientes;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.old.ImagemGenerica;
import br.com.automag.entity.old.Veiculo;

@Entity
public class Revenda extends Pessoa {

	@Enumerated(EnumType.STRING)
	private DOMINIO_TIPO_CLIENTE tipoCliente;

	private Date dataCadastro;

	private PessoaJuridica pessoaJuridica;

	private PessoaFisica pessoaFisica;

	private Set<Telefone> telefones;

	private Set<Veiculo> veliculos;

	private Endereco endereco;

	@ManyToOne
	@JoinColumn(name="idimagem")
	private ImagemGenerica logomarca;
}
