package com.example.maintenance_app;

public class HelperClass4 {
    String maintainer_number, watchman_number;

    public String getMaintainer_number() {
        return maintainer_number;
    }

    public void setMaintainer_number(String maintainer_number) {
        this.maintainer_number = maintainer_number;
    }

    public String getWatchman_number() {
        return watchman_number;
    }

    public void setWatchman_number(String watchman_number) {
        this.watchman_number = watchman_number;
    }

    public HelperClass4() {
    }

    public HelperClass4(String maintainer_number, String watchman_number) {
        this.maintainer_number = maintainer_number;
        this.watchman_number = watchman_number;
    }
}
