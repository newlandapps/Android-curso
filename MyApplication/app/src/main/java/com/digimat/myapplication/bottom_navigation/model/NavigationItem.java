package com.digimat.myapplication.bottom_navigation.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NavigationItem {

    @SerializedName("cve_object")
    @Expose
    private Integer cveObject;
    @SerializedName("obj_name")
    @Expose
    private String objName;
    @SerializedName("access_flag")
    @Expose
    private Boolean accessFlag;

    public NavigationItem(Integer cveObject, String objName, Boolean accessFlag) {
        this.cveObject = cveObject;
        this.objName = objName;
        this.accessFlag = accessFlag;
    }

    public Integer getCveObject() {
        return cveObject;
    }

    public void setCveObject(Integer cveObject) {
        this.cveObject = cveObject;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public Boolean getAccessFlag() {
        return accessFlag;
    }

    public void setAccessFlag(Boolean accessFlag) {
        this.accessFlag = accessFlag;
    }
}
