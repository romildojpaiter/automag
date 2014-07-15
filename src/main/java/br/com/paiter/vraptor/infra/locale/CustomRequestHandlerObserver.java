package br.com.paiter.vraptor.infra.locale;


public class CustomRequestHandlerObserver {
	
}

/*@Specializes
public class CustomRequestHandlerObserver extends RequestHandlerObserver {

	@Inject
	private Environment environment;

	@Inject
	public CustomRequestHandlerObserver(UrlToControllerTranslator translator,
			ControllerNotFoundHandler controllerNotFoundHandler,
			MethodNotAllowedHandler methodNotAllowedHandler,
			Event<ControllerFound> controllerFoundEvent,
			Event<RequestSucceded> endRequestEvent,
			InterceptorStack interceptorStack) {
		super(translator, controllerNotFoundHandler, methodNotAllowedHandler,
				controllerFoundEvent, endRequestEvent, interceptorStack);
	}
	
	@Override
	public void handle(@Observes VRaptorRequestStarted requestStarted) {
		String locale = environment.get("locale", "en");
		
		HttpServletRequest request = requestStarted.getRequest();
		request.setAttribute("javax.servlet.jsp.jstl.fmt.fallbackLocale.request", locale);
		request.setAttribute("javax.servlet.jsp.jstl.fmt.locale.request", locale);
		super.handle(requestStarted);
	}
}*/
