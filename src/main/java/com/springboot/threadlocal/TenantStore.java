package com.springboot.threadlocal;

public class TenantStore {
    private String tenantId;

    public void clear(){
        tenantId=null;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
