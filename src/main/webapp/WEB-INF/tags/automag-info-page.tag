<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="página de registro de clientes"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<%@attribute name="tituloNegrito" type="java.lang.String" %>
<%@attribute name="tituloNormal" type="java.lang.String"  required="true"%>
<%@attribute name="itemMensagemTab" type="java.lang.String" required="true"%>
<%@attribute name="linkMensagemTab" type="java.lang.String" %>
<%@attribute name="showCrumb" type="java.lang.Boolean" required="true" %>


<section id="car-pagination">
	<div class="content-holder">
		<div class="page-main-heading extra-space">
			<div class="heading-location">
				<h2><span class="bold"><c:out value="${tituloNegrito}"/></span> <c:out value="${tituloNormal}"/></h2>
				<c:if test="${showCrumb}">
					<p class="page-location">
						<a href="#">Home </a>
						<span class="greater-than">&gt;&gt;</span>
						<a href="#">Vehicle Insurance</a>
					</p>
				</c:if>
			</div>
		
		</div>
		
		<nav class="default-tabs split-tabs">
			<ul>
				<li class="current-item">
					<a href="<c:out value="${linkMensagemTab}"/>">
						<c:out value="${itemMensagemTab}" escapeXml="true" />
					</a>
				</li>
			</ul>
		</nav>
	</div>
</section>