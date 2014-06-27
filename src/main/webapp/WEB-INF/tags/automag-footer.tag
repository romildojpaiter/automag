<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Rodapé da página" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<footer>
		<div class="layer-one">
			<div class="content-holder">
				<nav>
					<ul>
						<li><a href="dealer-details.html"><span class="bold">Sobre</span> nos</a>
							<ul>
								<li><a href="#">Contato</a></li>
								<li><a href="#">Parceiros</a></li>
								<li><a href="#">Vendas</a></li>
								<li><a href="#">Site Map</a></li>
							</ul>
						</li>
						<li><a href="#"><span class="bold">Precisa</span> de Ajuda?</a>
							<ul>
								<li><a href="#">How do I add an offer?</a></li>
								<li><a href="#">How do I find a vehicle</a></li>
								<li><a href="#">Price list</a></li>
								<li><a href="#">Office for car dealers</a></li>
							</ul>
						</li>
						<li><a href="#"><span class="bold">Área</span> do Cliente</a>
							<ul>
								<li><a href="#">Adicione ofertas<a></li>
								<li><a href="${linkTo[IndexController].registrese}">Registre-se</a></li>
								<li><a href="#">Login</a></li>
								<li><a href="#">Notícias</a></li>
							</ul>
						</li>
					</ul>
				</nav>
					
				<div class="find-us-here">
					<h3><span class="bold">Encontre</span> nos aqui</h3>
					<ul class="social-list">
						<li class="social-facebook"><a href="#">Facebook</a></li>
						<li class="social-twitter"><a href="#">Twitter</a></li>
						<li class="social-google"><a href="#">Google</a></li>
					</ul>
					<p class="note"><fmt:message key="autonet.mensagem.cliente.fa"/></p>		
				</div>
			</div>
		</div><!--.layer-one-->
			
		<div class="layer-two">
			<div class="content-holder">
				<p class="copyright">&copy; 2014 Autonet Magazine. <fmt:message key="autonet.companing.right"/></p>
				<p class="webdesign-author"> <a href="#"><fmt:message key="paiter.tecnologia"/></a></p>
			</div>
		</div><!--.layer-two-->
</footer>
