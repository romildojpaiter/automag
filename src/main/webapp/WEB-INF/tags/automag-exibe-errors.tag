<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Página de Registro"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="content-holder content-errors">

	<div class="full-width">
		<ul>
			<c:if test="${errors != null}">
				<li>Ocorreram erros em sua solicitação</li>
				<li class="alert alert-danger">
			</c:if>
			<c:if test="${confirmations != null}">
				<li class="alert alert-success">
			</c:if>
			<c:forEach var="error" items="${errors}">
				${error.message}<br/>
			</c:forEach>

			<c:forEach var="confirmation" items="${confirmations}">
				${confirmation.message}<br/>
			</c:forEach>
			</li>
		</ul>
	</div>

</div>