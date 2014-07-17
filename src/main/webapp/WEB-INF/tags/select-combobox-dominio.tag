<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Monta arquivo de Selecao usando um array injetado"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@attribute name="id" type="java.lang.String" required="true" %>
<%@attribute name="name" type="java.lang.String" required="true" %>
<%@attribute name="label" type="java.lang.String" required="true" %>
<%@attribute name="showSelecione" type="java.lang.Boolean" required="true" %>
<%@attribute name="fieldRequired" type="java.lang.Boolean" %>
<%@attribute name="preSelected" type="java.lang.String" %>
<%@attribute name="itens" type="br.com.paiter.core.utils.dominio.BaseDominioInterface[]" required="true" %>

<div>
	<label for="${id}">${label}: <c:if test="${fieldRequired}"><span class="mandatory">*</span></c:if> </label>
	<select id="${id}" name="${name}">
		<c:if test="${showSelecione}">
			<option selected="selected">Selecione</option>
		</c:if>
		<c:forEach items="${itens}" var="dominio">
			<option value="${dominio.name}" <c:if test="${preSelected eq dominio.name}">selected</c:if> >${dominio.desc}</option>
		</c:forEach>
	</select>
</div>