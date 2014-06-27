<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Página de Registro" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<section id="log-in">

	<div class="content-holder">
	
		<div class="full-width">
			
			<tags:automag-form-autenticacao />
			
			
			<div class="one-half col-539">
				<form id="new-user" class="grey-corner-box">
					<fieldset>
						<legend><span class="bold">Novo</span> usuário</legend>
						<ul>
							<li class="select-two">
								<div>
									<input type="radio" name="type" value="register" id="register" />
									<label for="register"><fmt:message key="criar.cadastro"/><span class="description"><fmt:message key="crie.seu.conta"/></span></label>
								</div>
								<div>
									<input type="radio" name="type" value="add-offer" id="add-offer" />
									<label for="add-offer"><fmt:message key="adicionar.oferta"/><span class="description"><fmt:message key="enviar.informacoes.oferta"/></span></label>
								</div>
							</li>
							<li>
								<div class="checkbox-custom submit-field">
									<span class="submit"><input type="submit" value="Register" /></span>
								</div>
							</li>
						</ul>
					</fieldset>
				</form>
			</div>
			
			
		</div>
		
	</div>
	
</section><!--#search-list-->