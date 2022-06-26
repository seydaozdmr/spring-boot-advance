package com.springboot.threadlocal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoResource {
    @Autowired
    private TenantStore tenantStore;

    @RequestMapping(method = RequestMethod.GET)
    public String getDemo(){
        return String.format("Tenant : %s",this.tenantStore.getTenantId());
    }
}
