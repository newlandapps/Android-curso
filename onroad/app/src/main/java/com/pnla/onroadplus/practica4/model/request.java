package com.pnla.onroadplus.practica4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class request {


    @SerializedName("flag_parent")
    @Expose
    private Boolean flagParent;
    @SerializedName("token")
    @Expose
    private String token;

    public request(Boolean flagParent, String token) {
        super();
        this.flagParent = flagParent;
        this.token = token;
    }

    public Boolean getFlagParent() {
        return flagParent;
    }

    public void setFlagParent(Boolean flagParent) {
        this.flagParent = flagParent;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
