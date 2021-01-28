package com.example.maintenance_app;

public class HelperClass1 {
    String flat,payer,due;

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public HelperClass1() {
    }

    public HelperClass1(String flat, String payer, String due) {
        this.flat = flat;
        this.payer = payer;
        this.due = due;
    }
}
