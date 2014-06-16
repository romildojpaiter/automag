<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html>
  <head>
    <title>Administração Portalcom</title>
  </head>
  <body>
  
	<h1>Formulario</h1>
	<ul class="errors">
	  <c:forEach items="${errors}" var="error">
	    <li>
	      <!-- o campo em que ocorreu o erro, ou o tipo do erro -->
	      ${error.category}:
	
	      <!-- a mensagem de erro de validação -->
	      ${error.message}
	    </li>
	  </c:forEach>
	</ul>  
  	<form action="${linkTo[UsuarioController].salvar}" method="post">
  		<h2>Forulário de cadastro de Clientes</h2>
  		
  		<input type="hidden" name="usuario.id" value="${usuario.id}"/>
  		<input type="hidden" name="usuario.dataCadastro" value="${usuario.dataCadastroFormatado}"/>
  		<input type="hidden" name="usuario.perfil" value="${usuario.perfil}"/>
  		<input type="hidden" name="usuario.removido" value="${usuario.removido}"/>
  		<input type="hidden" name="usuario.situacao" value="${usuario.situacao}"/>
  		
  		<ul>
  			<li>Nome <br/>
  				<input type="text" name="usuario.nome" value="${usuario.nome}" />
  			</li>
  			<li>Email <br/>
  				<input type="text" name="usuario.email" value="${usuario.email}"/>
  			</li>
  			<li>Login <br/>
  				<input type="text" name="usuario.login" value="${usuario.login}"/>
  			</li>
  			<li>Senha <br/>
  				<input type="text" name="usuario.password" value="${usuario.password}"/>
  			</li>
  		</ul>
  		
  		<input type="submit" value="Gravar Usuário">
  	</form>
  </body>
</html>