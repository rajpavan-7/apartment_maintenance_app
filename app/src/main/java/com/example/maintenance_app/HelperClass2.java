package com.example.maintenance_app;

public class HelperClass2 {
    String Total_received, Total_spent, Total_due;

    public String getTotal_received() {
        return Total_received;
    }

    public void setTotal_received(String total_received) {
        Total_received = total_received;
    }

    public String getTotal_spent() {
        return Total_spent;
    }

    public void setTotal_spent(String total_spent) {
        Total_spent = total_spent;
    }

    public String getTotal_due() {
        return Total_due;
    }

    public void setTotal_due(String total_due) {
        Total_due = total_due;
    }

    public HelperClass2() {
    }

    public HelperClass2(String total_received, String total_spent, String total_due) {
        Total_received = total_received;
        Total_spent = total_spent;
        Total_due = total_due;
    }
}
