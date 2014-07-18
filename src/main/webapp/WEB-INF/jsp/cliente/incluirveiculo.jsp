<fmt:message key="painel.controle" var="painelcontrole"/>

<tags:header />

<tags:automag-start-page-content />

	<tags:automag-info-page tituloNegrito="Bem Vindo" tituloNormal=" ${usuarioLogado.cliente.pessoa.nome}" itemMensagemTab="${painelcontrole}" showCrumb="false" />
	
	<section id="painel-controle">
	
		<div class="content-holder">
	
			<div class="full-width">

				<tags:automag-menu-adm />	
						
				<div class="one-half col-700 painel-incluir-veiculo">
				
					<h3><span class="bold">Incluir Veí­culo</span></h3>
						
					<br />
					
							<div class="full-width light-grey-corner-box box-text-default-700">
								<h3>Divulgue agora mesmo seu carro no <strong>Automag </strong>e tenha o benefício da visualização de mais de 1 milhão de internautas!</h3>
								<p> Campos Obrigatórios são marcados com * </p>
								<p>Por favor, oferte somente veículos!</p>
								<p>Anúnciante tem uma sessão especial de serviços</p>
								<p>Se você está com difículdade em alguma parte do site, envie um e-mail para <strong>contato@automag.com.br</strong>, e logo entramos em contato.</p>
							</div>
							
							<div class="middle-width-700 sell-form <!--options-form-->">
								
								<form id="form-cadastro-veiculo" method="post">
								
									<fieldset id="vehicle-data">
										
										<legend><span class="bold">Veículo</span> informações</legend>
										
										<ul class="field-content">
											<li class="select-four">
												<div>
													<label for="marca">Marca: <span class="mandatory">*</span></label>
													<input id="marca" name="marca.nome" type="text" placeholder="Informe a marca" class="default-input"/>
												</div>
												<div>
													<label for="modelo">Modelo: <span class="mandatory">*</span></label>
													<input id="modelo" name="modelo.nome" type="text" placeholder="Informe o modelo" class="default-input"/>
												</div>
												<tags:select-combobox-dominio label="Tipo motorização" showSelecione="true" fieldRequired="true" itens="${comboBoxesAutonetmag.comboBoxDominioTipoMotorizacao}" id="select-tipo-motorizacao" name="motorizacao" />												
											</li>
											
											<li class="select-four">
												<div>
													<label for="ano-fabricacao">Ano de fabricação: <span class="mandatory">*</span></label>
													<input id="ano-fabricacao" name="veiculo.anoFabricacao" type="text" 
														placeholder="Informe o ano de fabricação" class="default-input"/>
												</div>
												<div>
													<label for="ano-modelo">Ano do modelo: <span class="mandatory">*</span></label>
													<input id="ano-modelo" name="veiculo.anoModelo" type="text" 
														placeholder="Informe o ano do modelo" class="default-input"/>
												</div>
												<div>
													<label for="cor">Cor: <span class="mandatory">*</span></label>
													<input id="cor" name="cor.nome" type="text" placeholder="Informe a cor" class="default-input"/>
												</div>
											</li>
											
											<li class="select-four">
												<tags:select-combobox-dominio label="Tipo combustível" showSelecione="true" fieldRequired="true" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCombustivel}" id="select-tipo-combustivel" name="combustivel" />												
												<tags:select-combobox-dominio label="Quantidade de portas" showSelecione="true" fieldRequired="true" itens="${comboBoxesAutonetmag.comboBoxDominioQtdPortas}" id="select-portas" name="portas" />												
												<tags:select-combobox-dominio label="Tipo veículo" showSelecione="true" fieldRequired="true" itens="${comboBoxesAutonetmag.comboBoxDominioTipoVeiculo}" id="select-tipo-veiculo" name="tipoveiculo" />												
											</li>
											
										</ul>
									</fieldset>
									
									<fieldset id="vehicle-equipment" class="field-content">
										<legend><span class="bold">Condições</span></legend>
										<ul class="field-content">
											<li class="select-four">
												<tags:select-combobox-dominio label="Pneus" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-pneus" name="pneus" />
												<tags:select-combobox-dominio label="Interior" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-interior" name="interior" />
												<tags:select-combobox-dominio label="Exterior" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-exterior" name="exterior" />
											</li>											
											<li class="select-four">
												<tags:select-combobox-dominio label="Motor" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-motor" name="motor" />
												<tags:select-combobox-dominio label="Bancos" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-bancos" name="bancos"/>
												<tags:select-combobox-dominio label="Freios" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-freios" name="freios" />
											</li>											
											<li class="select-four">
												<tags:select-combobox-dominio label="Suspensão" showSelecione="false" preSelected="BOM" itens="${comboBoxesAutonetmag.comboBoxDominioTipoCondicao}" id="select-suspencao" name="suspencao" />
											</li>
										</ul>
									
									</fieldset>
									
									<fieldset id="vehicle-equipment" class="checkbox-selection">
										<legend><span class="bold">Itens</span> Opcionais</legend>
										<ul class="field-content">
											<c:forEach items="${listaItensOpcionais}" var="itemOpcional">
												<li><input type="checkbox" id="${itemOpcional.label}" value="${itemOpcional.id}" /><label for="${itemOpcional.label}">${itemOpcional.nome}</label></li>
											</c:forEach>
										</ul>
									
									</fieldset>
									
									<fieldset id="vehicle-description">
										<legend><span class="bold">Descrição</span></legend>
										<div class="field-content">
											<label for="veiculo-observacao">Descrição:</label>
											<textarea id="veiculo-observacao" name="veiculo.observacao" class="description"></textarea>
										</div>
									</fieldset>
									
									<fieldset id="vehicle-price">
										<legend><span class="bold">Veículo</span> valor</legend>
										<ul class="field-content">
											<li class="select-four">
												<div>
													<label for="valor">Valor: <span class="mandatory">*</span></label>
													<input id="valor" name="veiculo.preco" type="text" placeholder="Informe o Valor" class="default-input"/>
												</div>
												<div class="checkbox-custom">
													<div><input type="checkbox" value="checkbox_abs" id="check-valor-negociavel" name="veiculo.valornegociavel"/></div>
													<label for="check-valor-negociavel">&nbsp; Valor negociavél</label>
												</div>
											</li>
										</ul>
									</fieldset>
									
									<fieldset id="vehicle-photos">
										<legend><span class="bold">Veículo</span> fotos</legend>
										<ul class="field-content">
											<li class="select-six">
												<div class="upload-file-container">
													<span>
														<input type="file" name="files[]" />
													</span>
												</div>
												<div class="upload-file-container">
													<span>
														<input type="file" name="files[]" />
													</span>
												</div>
												<div class="upload-file-container">
													<span>
														<input type="file" name="files[]" />
													</span>
												</div>
												<div class="upload-file-container">
													<span>
														<input type="file" name="files[]" />
													</span>
												</div>
											</li>
										</ul>
									</fieldset>
									
									
									<fieldset id="vehicle-submit" class="checkbox-selection">
										<div>
											<div class="agree-checkbox">
												<input type="checkbox" value="agreed" id="check-agreed" /><label for="check-agreed">I agree to the Terms and Conditions. </label>
											</div>
											<div class="submit-vehicle default-submit">
												<input type="submit" value="enviar" />
											</div>
										</div>
											
									</fieldset>
									
								</form>		
										
							</div>
							

				</div>				
						
			</div>
			
		</div>
		
	</section>
	
	<script>
		$(function() {
			var url = "http://localhost:8080<c:url value='/interoperabilidade/listaMarcas'/>";
			var marcas = [];
			$.getJSON( url, function( json ) {
				$.each(json.marcas, function(i){  
					marcas[i] = json.marcas[i].id +" - " + json.marcas[i].nome;
				}); 
			});
			$("#marca" ).autocomplete({
				source: marcas
			});
		});
		$(function() {
			var url = "http://localhost:8080<c:url value='/interoperabilidade/listaMarcas'/>";
			var modelos = [];
			$.getJSON( url, function( json ) {
				$.each(json.marcas, function(i){  
					marcas[i] = json.marcas[i].id +" - " + json.marcas[i].nome;
				}); 
			});
			$("#modelo" ).autocomplete({
				source: modelos
			});
		});
		
		$(function() {
			var url = "http://localhost:8080<c:url value='/interoperabilidade/listaCores'/>";
			var cores = [];
			$.getJSON( url, function( json ) {
				$.each(json.cores, function(i){  
					cores[i] = json.cores[i].id +" - " + json.cores[i].nome;
				}); 
			});			
			$("#cor" ).autocomplete({
				source:cores,
			});
		});
		
	</script>

	
<tags:automag-end-page-content />