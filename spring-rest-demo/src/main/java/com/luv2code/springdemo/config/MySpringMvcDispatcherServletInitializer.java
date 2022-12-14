package com.luv2code.springdemo.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    @Nullable
    protected Class<?>[] getRootConfigClasses() {
        
        return null;
    }

    @Override
    @Nullable
    protected Class<?>[] getServletConfigClasses() {
        
        return new Class[] { DemoAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        
        return new String[] {"/"};
    }
    
}
