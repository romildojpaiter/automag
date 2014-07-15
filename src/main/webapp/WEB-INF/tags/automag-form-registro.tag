<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Página de Registro" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section id="log-in">

    <tags:automag-exibe-errors />
    
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
									<input type="text" name="pessoa.nome" placeholder="Nome" id="nome" value="${pessoa.nome}"/>
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="text" name="pessoa.email" placeholder="E-mail" id="email" value="${pessoa.email}"  />
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="text" name="conta.login" id="login"  placeholder="Login" value="${conta.login}" />
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="password" name="conta.password" id="password"  placeholder="Senha"/>
								</div>
							</li>
							<li>
								<div class="form-group">
									<input type="password" name="conta.temporalPassword" id="temporalPassword"  placeholder="Confirma senha"/>
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