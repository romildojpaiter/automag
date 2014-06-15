<!DOCTYPE html>

<html>
  <head>
    <title>Administração Portalcom</title>
  </head>
  <body>
  	<form action="${linkTo[UsuarioController].salvar}" method="post">
  		<h2>Forulário de cadastro de Clientes</h2>
  		
  		<input type="hidden" value="${usuario.id}" name="usuario.id"/>
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