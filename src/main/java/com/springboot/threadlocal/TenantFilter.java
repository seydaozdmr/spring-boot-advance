package com.springboot.threadlocal;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TenantFilter implements Filter {
    private static final String TENANT_HEADER_NAME="X-TENANT-ID";
    @Autowired
    private TenantStore tenantStore;


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String tenantId=request.getHeader(TENANT_HEADER_NAME);

        try{
            this.tenantStore.setTenantId(tenantId);
            filterChain.doFilter(servletRequest,servletResponse);
        }finally {
            this.tenantStore.clear();
        }
    }
}
