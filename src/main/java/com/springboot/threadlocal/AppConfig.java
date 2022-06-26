package com.springboot.threadlocal;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.target.ThreadLocalTargetSource;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Filter tenantFilter(){
        return new TenantFilter();
    }

    @Bean
    public FilterRegistrationBean tenantFilterRegistration(){
        FilterRegistrationBean result=new FilterRegistrationBean();
        result.setFilter(this.tenantFilter());
        result.setUrlPatterns(List.of("/*"));
        result.setName("Tenant Store Filter");
        result.setOrder(1);
        return result;
    }
    /**
     *  threadLocalTenantStore bean: The ThreadLocalTargetSource is useful
     *  when you need an object, a TenantStore.java instance in this case,
     *  to be created for each incoming request. The target (a TenantStore.java object)
     *  will be instantiated only once in each thread and will get removed from each
     *  thread’s threadLocals map when  ThreadLocalTargetSource’s destroy() is called,
     *  for instance when the application is shut down.
    */
    @Bean(destroyMethod = "destroy")
    public ThreadLocalTargetSource threadLocalTargetSource(){
        ThreadLocalTargetSource result = new ThreadLocalTargetSource();
        result.setTargetBeanName("tenantStore");
        return result;
    }

    /**
     *  proxiedThreadLocalTargetSource bean. According to the documentation
     *  and source code comments, TargetSources must run in a BeanFactory since they need to
     *  call the getBean()method to create a new prototype instance.
     * @param threadLocalTargetSource
     * @return
     */

    @Primary
    @Bean(name = "proxiedThreadLocalTargerSource")
    public ProxyFactoryBean proxiedThreadLocalTargetSource(ThreadLocalTargetSource threadLocalTargetSource){
        ProxyFactoryBean result=new ProxyFactoryBean();
        result.setTargetSource(threadLocalTargetSource);
        return result;
    }

    /**
     * The tenantStore bean is the target object stored in each thread.
     * It is required to be prototype-scoped in the
     * AbstractPrototypeBasedTargetSource, parent class of the  ThreadLocalTargetSource.
     * @return
     */
    @Bean(name = "tenantStore")
    @Scope(scopeName = "prototype")
    public TenantStore tenantStore(){
        return new TenantStore();
    }
}
