<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de Usuários</h3>
	<c:forEach items="${usuarioList}" var="usuario">
		<li>${usuario.nome} - ${usuario.email}
			<a href="${linkTo[UsuarioController].editar}?idUsuario=${usuario.id}">Modificar</a> 
			<a href="${linkTo[UsuarioController].remover}?idUsuario=${usuario.id}">Remover</a> 
		</li>
	</c:forEach>
	<br/>
	<a href="${linkTo[UsuarioController].formulario}">Adicionar Novo</a> 	
</body>
</html>