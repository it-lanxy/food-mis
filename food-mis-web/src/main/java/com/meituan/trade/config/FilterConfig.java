package com.meituan.trade.config;

import com.sankuai.it.sso.sdk.spring.FilterFactoryBean;
import com.sankuai.meituan.uac.sdk.filter.UacFilterFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author: lanxinyu@meituan.com  2018-11-14 下午2:47
 * @Description:
 */
@Configuration
public class FilterConfig implements BeanPostProcessor {

    public static final String SSO_INCLUDED_URI         = "/maidan/**,/tuangou/**,/quanma/**,/diancan/**";
    public static final String SSO_EXCLUDED_URI         = "/static/**,/octo/checkAlive,/,/heartbeat";

    @Bean("ssoFilter") public FilterFactoryBean ssoFilter() {
        FilterFactoryBean ssoFactoryBean = new FilterFactoryBean();
        ssoFactoryBean.setClientId("56c482e4eb");
        ssoFactoryBean.setSecret("9f55489e591c41359efd263221718b35");
        ssoFactoryBean.setIncludedUriList(SSO_INCLUDED_URI);
        ssoFactoryBean.setExcludedUriList(SSO_EXCLUDED_URI);
        return ssoFactoryBean;
    }

    @Bean("authFilter") public UacFilterFactoryBean authFilter() {
        UacFilterFactoryBean authFactoryBean = new UacFilterFactoryBean();
        authFactoryBean.setAppKey("56c482e4eb");
        authFactoryBean.setSecret("6920df8d6efa4ab8be6413f8e2d46ad1");
        authFactoryBean.setIncludedUriList(SSO_INCLUDED_URI);
        authFactoryBean.setExcludedUriList(SSO_EXCLUDED_URI);
        return authFactoryBean;
    }

    @Bean public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
