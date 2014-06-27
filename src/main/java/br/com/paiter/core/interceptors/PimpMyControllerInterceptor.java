package br.com.paiter.core.interceptors;

import javax.inject.Inject;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.paiter.core.factory.MessageFactory;
import br.com.paiter.core.infra.ThreadLocals;

@Intercepts
public class PimpMyControllerInterceptor implements Interceptor {

	@Inject private Result result;
	@Inject private MessageFactory factory;

	@Override
	public boolean accepts(ControllerMethod arg0) {
		return true;
	}

	@Override
	public void intercept(InterceptorStack stack, ControllerMethod method,
			Object obj) throws InterceptionException {
		try {
			locals.reset().put(Result.class, result).put(MessageFactory.class, factory);
			stack.next(method, obj);
		} finally {
			locals.clear();
		}
	}

	private static final ThreadLocals locals = new ThreadLocals();

	public static Result getResult() {
		return locals.get(Result.class);
	}

	public static MessageFactory getFactory() {
		return locals.get(MessageFactory.class);
	}

}
