package com.digimat.myapplication.bottom_navigation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MenuOptionRequest {
    @SerializedName("cve_object")
    @Expose
    private int cveObject;
    @SerializedName("token")
    @Expose
    private String token;

    public MenuOptionRequest(int cveObject, String token) {
        this.cveObject = cveObject;
        this.token = token;
    }

    public Integer getCveObject() {
        return cveObject;
    }

    public void setCveObject(int cveObject) {
        this.cveObject = cveObject;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
