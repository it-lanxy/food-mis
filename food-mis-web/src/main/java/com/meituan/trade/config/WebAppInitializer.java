package com.meituan.trade.config;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author: lanxinyu@meituan.com  2018-11-05 下午3:28
 * @Description: DispatcherServlet
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringServletConfig.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        /**
         * 映射到 "/" {@link FilterConfig}
         */
        DelegatingFilterProxy characterEncodingFilterProxy = new DelegatingFilterProxy();
        characterEncodingFilterProxy.setTargetBeanName("characterEncodingFilter");
        characterEncodingFilterProxy.setTargetFilterLifecycle(Boolean.TRUE);

        DelegatingFilterProxy ssoFilterProxy = new DelegatingFilterProxy();
        ssoFilterProxy.setTargetBeanName("ssoFilter");
        ssoFilterProxy.setTargetFilterLifecycle(Boolean.TRUE);


        DelegatingFilterProxy authFilterProxy = new DelegatingFilterProxy();
        authFilterProxy.setTargetBeanName("authFilter");
        authFilterProxy.setTargetFilterLifecycle(Boolean.TRUE);

        return new Filter[] { characterEncodingFilterProxy, ssoFilterProxy};
    }


}
