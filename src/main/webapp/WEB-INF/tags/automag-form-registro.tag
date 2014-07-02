<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Página de Registro" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<section id="log-in">

	<div class="content-holder">
	
		<div class="full-width">
			
			<tags:automag-form-autenticacao />
			
			
			<div class="one-half col-539">
				<form id="validateFormNovoCadastro" class="grey-corner-box novo-cadastro" method="post" 
					action="${linkTo[RegistroController].concluirNovoCadastro}">
					<fieldset>
						<legend><span class="bold">Novo</span> usuário</legend>
						<ul>
							<li>
								<div class="form-group">
									<input type="text" name="nome" placeholder="Nome" id="nome" />
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="text" name="email" placeholder="E-mail" id="email" />
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="text" name="login" id="login"  placeholder="Login"/>
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="password" name="password" id="password"  placeholder="Senha"/>
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="password" name="confirm_password" id="confirm_password"  placeholder="Confirma senha"/>
								</div>
							</li>
							<li>
								<div class="checkbox-custom submit-field">
									<span class="submit">
										<input type="submit" value="<fmt:message key="registar"/>" />
									</span>
								</div>
							</li>
						</ul>
					</fieldset>
				</form>
			</div>

		</div>
		
	</div>
	
</section><!--#search-list-->