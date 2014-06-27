package br.com.paiter.core.view;


// @Specializes
public class FreemarkerPathResolver{ // extends DefaultPathResolver {
	
	protected String getPrefix() {
		return "/WEB-INF/freemarker/";
	}

	protected String getExtension() {
		return "ftl";
	}
	
}
