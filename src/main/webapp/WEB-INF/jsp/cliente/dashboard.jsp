<fmt:message key="painel.controle" var="painelcontrole"/>

<tags:header />

<tags:automag-start-page-content />

	<tags:automag-info-page tituloNegrito="Bem Vindo" tituloNormal=" ${usuarioLogado.cliente.pessoa.nome}" itemMensagemTab="${painelcontrole}" showCrumb="false" />
	
	<section id="painel-controle">
	
		<div class="content-holder">
	
			<div class="full-width">
	
			<tags:automag-menu-adm />			
	
			<div class="one-half col-700 painel-controle">
				<h3><span class="bold">Carros</span></h3>
				<table>
					<tr>
						<td>
							<a href="#">Perfil</a>
						</td>
					</tr>
					<tr>
						<td>
							<a href="${linkTo[ClienteController].meusveiculos}">Meus ve�culos</a>
						</td>
					</tr>
				</table>
			</div>				

						
			</div>
			
		</div>
		
	</section>

	
<tags:automag-end-page-content />