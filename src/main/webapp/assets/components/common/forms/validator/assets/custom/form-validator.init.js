$.validator.setDefaults(
{
	// submitHandler: function() { alert("submitted!"); },
	showErrors: function(map, list) 
	{
		this.currentElements.parents('label:first, div:first').find('.has-error').remove();
		this.currentElements.parents('.form-group:first').removeClass('has-error');
		
		$.each(list, function(index, error) 
		{
			var ee = $(error.element);
			var eep = ee.parents('label:first').length ? ee.parents('label:first') : ee.parents('div:first');
			
			ee.parents('.form-group:first').addClass('has-error');
			eep.find('.has-error').remove();
			eep.append('<p class="has-error help-block">' + error.message + '</p>');
		});
		//refreshScrollers();
	}
});

$(function()
{
	// validate signup form on keyup and submit
	$("#validateSubmitForm").validate({
		rules: {
			firstname: "required",
			lastname: "required",
			username: {
				required: true,
				minlength: 2
			},
			password: {
				required: true,
				minlength: 5
			},
			confirm_password: {
				required: true,
				minlength: 5,
				equalTo: "#password"
			},
			email: {
				required: true,
				email: true
			},
			topic: {
				required: "#newsletter:checked",
				minlength: 2
			},
			agree: "required"
		},
		messages: {
			firstname: "Please enter your firstname",
			lastname: "Please enter your lastname",
			username: {
				required: "Please enter a username",
				minlength: "Your username must consist of at least 2 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			},
			confirm_password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long",
				equalTo: "Please enter the same password as above"
			},
			email: "Please enter a valid email address",
			agree: "Please accept our policy"
		}
	});
	
	// validate signup form on keyup and submit
	$("#validateFormNovoCadastro").validate({
		rules: {
			'pessoa.nome': "required",
			'pessoa.email': {
				required: true,
				email: true
			},
			'conta.login': {
				required: true,
				minlength: 3
			},
			'conta.password': {
				required: true,
				minlength: 5
			},
			'conta.temporalPassword': {
				required: true,
				minlength: 5,
				equalTo: "#password"
			}			
		},
		messages:{
			'pessoa.nome': "Informe o seu nome",
			'pessoa.email': "Informe um e-mail valido",
			'conta.login':{
				required: "Informe um Login",
				minlength: "Seu login deve ter pelo menos 3 caracteres"
			},
			'conta.password': {
				required: "Informe sua senha",
				minlength: "Sua senha deve ter pelo menos 5 caracteres"
			},
			'conta.temporalPassword': {
				required: "Informe sua senha",
				minlength: "Sua senha deve ter pelo menos 5 caracteres",
				equalTo: "Entre sua senha igual a senha"
			}		
		}
	});
	
	// propose username by combining first- and lastname
	$("#username").focus(function() {
		var firstname = $("#firstname").val();
		var lastname = $("#lastname").val();
		if(firstname && lastname && !this.value) {
			this.value = firstname + "." + lastname;
		}
	});

	//code to hide topic selection, disable for demo
	var newsletter = $("#newsletter");
	// newsletter topics are optional, hide at first
	var inital = newsletter.is(":checked");
	var topics = $("#newsletter_topics")[inital ? "removeClass" : "addClass"]("gray");
	var topicInputs = topics.find("input").attr("disabled", !inital);
	// show when newsletter is checked
	newsletter.click(function() {
		topics[this.checked ? "removeClass" : "addClass"]("gray");
		topicInputs.attr("disabled", !this.checked);
	});
});