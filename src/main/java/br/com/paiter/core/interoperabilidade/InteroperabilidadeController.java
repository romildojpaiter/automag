package br.com.paiter.core.interoperabilidade;

import java.util.List;

import javax.inject.Inject;

import br.com.automag.entity.veiculos.Cor;
import br.com.automag.entity.veiculos.Marca;
import br.com.automag.persistencia.CorDAO;
import br.com.automag.persistencia.MarcaDAO;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class InteroperabilidadeController {

	@Inject private Result result;
	@Inject private CorDAO corDAO;
	@Inject private MarcaDAO marcaDAO;
	
	
	public void listaCores(){
		List<Cor> cores = corDAO.findCoresAtivas();
		result.use(Results.json()).from(cores, "cores").serialize();
	}
	
	public void listaMarcas(){
		List<Marca> marcas = marcaDAO.findMarcasAtivas();
		result.use(Results.json()).from(marcas, "marcas").serialize();
	}
	
	
}
