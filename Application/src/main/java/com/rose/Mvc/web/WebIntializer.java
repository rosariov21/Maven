package com.rose.Mvc.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.rose.application.mvc.MyConfig;

public class WebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses(){
		return null;
	}
	
	
	@Override 
	protected Class<?>[] getServletConfigClasses(){
		return new Class[] {MyConfig.class};
		
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
}
