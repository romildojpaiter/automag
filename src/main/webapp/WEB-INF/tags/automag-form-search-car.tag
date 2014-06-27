<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<%@attribute name="type" type="java.lang.String"  %> <!-- required="true" -->

			
<form id="header-search" action="car-list.html" method="post">
    <input type="text" name="quick_search" onfocus="if(this.value == '<fmt:message key="autonet.mgs.busca.rapida"/>') { this.value = ''; }" 
    	onblur="if(this.value == '') { this.value = '<fmt:message key="autonet.mgs.busca.rapida"/>'; }" value="<fmt:message key="autonet.mgs.busca.rapida"/>" class="quick-search" >
	<select name="type-option">
		<option value="CARRO" selected="selected"><fmt:message key="veiculo.carros" /></option>
		<option value="MOTO"><fmt:message key="veiculo.motos" /></option>
		<option value="CAMINHONETA"><fmt:message key="veiculo.caminhonetes" /></option>
		<option value="CAMINHAO"><fmt:message key="veiculo.caminhoes" /></option>
		<option value="CARRETA"><fmt:message key="veiculo.carretas" /></option>
		<option value="SERVICO"><fmt:message key="veiculo.servicos" /></option>
		<option value="TODOS"><fmt:message key="veiculo.todos" /></option>
	</select>
	
	<div class="search-submit">
		<input type="submit" value="<fmt:message key="btn.lbl.buscar"/>" />
	</div>
	
</form>