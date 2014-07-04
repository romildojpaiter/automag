package br.com.automag.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.inject.Inject;

import br.com.automag.business.ClienteBusiness;
import br.com.automag.dominio.DominioSimNao.DOMINIO_SIM_NAO;
import br.com.automag.dominio.DominioTipoCliente.DOMINIO_TIPO_CLIENTE;
import br.com.automag.entity.usuarios.Cliente;
import br.com.automag.entity.usuarios.Conta;
import br.com.automag.entity.usuarios.Pessoa;
import br.com.automag.validators.ClienteValidator;
import br.com.automag.validators.EmailValidator;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.routes.annotation.Routed;
import br.com.caelum.vraptor.validator.Message;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;

@Routed
@Controller
public class RegistroController extends BaseController{
	
	@Inject
	private ClienteBusiness clienteBusiness;
	
	@Inject
	private Validator validator;
	
	@Inject
	private ClienteValidator clienteValidator;
	
	@Inject
	private EmailValidator emailValidator;
	
	@Inject
	private Result result;
	
	
	public void formNovoCadastro(){
		
	}
	
	@Post
	public void concluirNovoCadastro(Pessoa pessoa, Conta conta){
		
		Cliente cliente = new Cliente();
		cliente.setPessoa(pessoa);
		cliente.setContaPrincipal(conta);
		cliente.setContas(new HashSet<Conta>());
		cliente.getContas().add(conta);
		cliente.setDataCadastro(new Date());
		cliente.setTipoCliente(DOMINIO_TIPO_CLIENTE.PESSOA_FISICA);
		cliente.setTermosAceitos(true);
		
		conta.setCliente(cliente);
		conta.setDataCadastro(new Date());
		pessoa.setCliente(cliente);
		pessoa.setDocumentoCPF("00000000000");
		pessoa.setRegistroGeral("000000-0");
		pessoa.setAceitaReceberEmail(DOMINIO_SIM_NAO.SIM);
		pessoa.setConcordaTermosDeUso(DOMINIO_SIM_NAO.SIM);
		
		clienteValidator.validate(conta.getLogin());
		emailValidator.validate(pessoa.getEmail());
		
		List<Message> errors = clienteValidator.getValidator().getErrors();
		// errors.addAll(emailValidator.getValidator().getErrors());
		
		if(!errors.isEmpty()){
			clienteValidator.getValidator().onErrorRedirectTo(IndexController.class).registrese();
		}
		
		try {
			clienteBusiness.salvar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
