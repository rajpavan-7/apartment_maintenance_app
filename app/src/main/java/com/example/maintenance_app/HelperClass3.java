package com.example.maintenance_app;

public class HelperClass3 {
    String Amount, OnWhat;

    public HelperClass3() {
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getOnWhat() {
        return OnWhat;
    }

    public void setOnWhat(String onWhat) {
        OnWhat = onWhat;
    }

    public HelperClass3(String amount, String onWhat) {
        Amount = amount;
        OnWhat = onWhat;
    }
}
