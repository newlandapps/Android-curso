package com.digimat.myapplication.practica4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("origin_adm")
    @Expose
    private Integer originAdm;
    @SerializedName("cve_employee")
    @Expose
    private Integer cveEmployee;
    @SerializedName("employee_internal_cve")
    @Expose
    private String employeeInternalCve;
    @SerializedName("employee_name")
    @Expose
    private String employeeName;
    @SerializedName("employee_email")
    @Expose
    private String employeeEmail;

    public Datum(Integer originAdm, Integer cveEmployee, String employeeInternalCve, String employeeName, String employeeEmail) {
        super();
        this.originAdm = originAdm;
        this.cveEmployee = cveEmployee;
        this.employeeInternalCve = employeeInternalCve;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    public Integer getOriginAdm() {
        return originAdm;
    }

    public void setOriginAdm(Integer originAdm) {
        this.originAdm = originAdm;
    }

    public Integer getCveEmployee() {
        return cveEmployee;
    }

    public void setCveEmployee(Integer cveEmployee) {
        this.cveEmployee = cveEmployee;
    }

    public String getEmployeeInternalCve() {
        return employeeInternalCve;
    }

    public void setEmployeeInternalCve(String employeeInternalCve) {
        this.employeeInternalCve = employeeInternalCve;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

}