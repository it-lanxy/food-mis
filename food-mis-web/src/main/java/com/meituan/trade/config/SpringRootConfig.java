package com.meituan.trade.config;

import com.meituan.trade.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.util.UrlPathHelper;

/**
 * @author: lanxinyu@meituan.com  2018-11-05 下午3:30
 * @Description: ContextLoaderListener
 */
@Configuration
@ComponentScan(
        basePackageClasses = Application.class,
        excludeFilters = {
                @ComponentScan.Filter(type=FilterType.ANNOTATION, value={EnableWebMvc.class})
        }
)
public class SpringRootConfig {

    @Bean public UrlPathHelper urlPathHelper() {
            return new UrlPathHelper();
        }
}
