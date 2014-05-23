package br.com.automag.entity;

import br.com.automag.paiter.core.entity.PersistEntity;
import br.com.automag.paiter.dominio.DOMINIO_TIPO_CLIENTE;
import java.util.Date;
import br.com.automag.paiter.dominio.DominioSimNao;

public class Revenda extends Pessoa implements PersistEntity {

	private Long idCliente;

	private DOMINIO_TIPO_CLIENTE tipoCliente;

	private Date dataCadastro;

	private DominioSimNao.DOMINIO_TIPO_CONDICAO ativo;

	private PessoaJuridica pessoaJuridica;

	private Telefone[] telefones;

	private Endereco endereco;

	private PessoaFisica pessoaFisica;

	private Veiculo[] veliculos;

	private ImagemGenerica logomarca;

}
