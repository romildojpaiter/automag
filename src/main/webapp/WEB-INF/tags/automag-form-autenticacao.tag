<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Página de Registro"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>


<div class="one-half col-539">
	<form id="returning-user" class="grey-corner-box"
		action="${linkTo[ClienteController].login}">
		<fieldset>
			<legend>
				<span class="bold">Identificação</span> do usuário
			</legend>
			<ul>
				<li class="select-two">
					<div>
						<label for="login-email">Email:</label> <input type="text"
							name="login" id="login-email" />
					</div>
					<div>
						<label for="login-password">Password:</label> <input
							type="password" name="password" id="login-password" />
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