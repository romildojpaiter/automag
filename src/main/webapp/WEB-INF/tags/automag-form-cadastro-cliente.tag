<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag description="Formulario Cadastro de cliente"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>



<section id="form-novo-cadastro">

	<div class="content-holder">

		<div class="full-width light-grey-corner-box box-text-default">
			<h3>
				Sell ​​your car on <strong>AutoMarket </strong>and benefit from more
				than 1 million potential buyers every month!
			</h3>
			<p>Required fields are marked with *</p>
			<p>Please post offers only on the car (parts are a special
				category).</p>
			<p>If you are a dealer, please visit the dealers section</p>
			<p>If you have difficulties in posting an offer on the website,
				please call 0742 016 570</p>
		</div>

		<section id="cadastro-cliente">
			<div class="full-width">

				<div class="one-half col-241 info-novo-cadastro">
					<h3>
						Sell ​​your car on <strong>AutoMarket </strong>and benefit from
						more than 1 million potential buyers every month!
					</h3>


				</div>

				<div class="one-half col-701 form-novo-cadastro">
				
					<form id="validateSubmitForm" class="grey-corner-box" method="post" action="${linkTo[RegistroController].concluirNovoCadastro}">
						<fieldset>
							<legend><span class="bold">Informações</span> da conta</legend>

                            <div class="field">
                                <label for="firstname">Nome</label>
                                <div>
                                    <input  id="nome" class="default-input"
                                    	name="nome" type="text" placeholder="Nome" />
                                </div>
                            </div>	
                            <div class="field">
                                <label for="email">E-mail</label>
                                <div>
                                    <input  id="email" class="default-input"
                                    	name="firstname" type="text" placeholder="E-mail" />
                                </div>
                            </div>	                            						
                            <div class="field">
                                <label for="password">Senha</label>
                                <div>
                                    <input  id="password" class="default-input"
                                    	name="password" type="password"  placeholder="Senha"/>
                                </div>
                            </div>
                            	                            						
                            <div class="field">
                                <label for="confirm_password">Confirme Senha</label>
                                <div>
                                    <input id="confirm_password" class="default-input"
                                    	name="confirm_password" type="password"  placeholder="Confirma senha"/>
                                </div>
                            </div>
                            	                            						
							<br/>
							<ul>
								<li>
									<div class="submit-button">
											<input type="submit" value="Enviar"  />
									</div>
								</li>
							</ul>
							
						</fieldset>
					</form>
				</div>
			</div>
		</section>
	</div>
</section>