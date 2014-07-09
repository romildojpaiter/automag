<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Página de Registro"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="one-half col-539">
	<form id="validateFormLogin" class="grey-corner-box" method="post"
		action="${linkTo[AutenticadorController].autenticador}">
		<ul class=has-error>
		  <c:forEach items="${errorslogin}" var="error">
		    <li>
		      ${errorslogin.message}
		    </li>
		  </c:forEach>
		</ul>		
		<fieldset>
			<legend>
				<span class="bold">Identificação</span> do usuário
			</legend>
			<ul>
				<li class="select-two">
					<div class="form-group">
						<input type="text" name="login" id="login-email" placeholder="Login" />
					</div>
					<div class="form-group">
						<input type="password" name="password" id="login-password" placeholder="Senha" />
					</div>
				</li>
				<li>
					<div class="checkbox-custom submit-field">
						<span class="submit"><input type="submit" value="Log in" /></span>
						<input type="checkbox" value="remember_me" id="remember-me"
							checked="checked" /> <label for="remember-me">Lembrar de
							mim</label>
					</div>
				</li>
			</ul>
		</fieldset>
	</form>
</div>