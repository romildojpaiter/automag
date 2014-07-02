<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Header de Conteudo da página"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<%@attribute name="modalId" type="java.lang.String" %>
<%@attribute name="type" type="java.lang.String"  %>


<div class="content-holder">
	<div class="layer-one">
		<div class="page-titles">
			<h1><a href="${linkTo[IndexController].index}"><fmt:message key="site.name"/></a></h1>
			<p class="sub-title"><fmt:message key="subtitle.site.name"/></p>
		</div>
			
		<div class="dealer-login">
			<a href="dealer-details.html" class="dealer-name">
				<fmt:message key="dealer.login" />
			</a>
			<a href="#" class="sign-out">
				<fmt:message key="sign.out" />
			</a>
		</div>
			
	</div><!--.layer-one-->
		
	<div class="layer-two">
		<nav>
			<ul>
				<li class="nav-cars current-item"><a href="car-list.html"><fmt:message key="veiculo.carros"/></a></li>
				<li class="nav-bike"><a href="#"><fmt:message key="veiculo.motos"/></a></li>
				<li class="nav-truck"><a href="#"><fmt:message key="veiculo.pessados"/></a></li>
				<li class="nav-parts"><a href="#"><fmt:message key="veiculo.pecas"/></a></li>
			</ul>
		</nav>
		
		<tags:automag-form-search-car />
		
	</div><!--.layer-two-->
</div>
