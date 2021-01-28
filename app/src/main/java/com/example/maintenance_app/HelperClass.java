package com.example.maintenance_app;

import android.widget.TextView;

public class HelperClass {
    String flatNo, owner, tenant, contactNo;

    public HelperClass() {
    }

    public HelperClass(String flatNo, String owner, String tenant, String contactNo) {
        this.flatNo = flatNo;
        this.owner = owner;
        this.tenant = tenant;
        this.contactNo = contactNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
