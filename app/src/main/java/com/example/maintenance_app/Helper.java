package com.example.maintenance_app;

public class Helper {
    private String Owner, Tenant;
    private long FlatNo , ContactNo;

    public Helper() {
    }

    public Helper(String owner, String tenant, long flatNo, long contactNo) {
        Owner = owner;
        Tenant = tenant;
        FlatNo = flatNo;
        ContactNo = contactNo;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getTenant() {
        return Tenant;
    }

    public void setTenant(String tenant) {
        Tenant = tenant;
    }

    public long getFlatNo() {
        return FlatNo;
    }

    public void setFlatNo(long flatNo) {
        FlatNo = flatNo;
    }

    public long getContactNo() {
        return ContactNo;
    }

    public void setContactNo(long contactNo) {
        ContactNo = contactNo;
    }
}
