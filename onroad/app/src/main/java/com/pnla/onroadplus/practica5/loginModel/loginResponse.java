package com.pnla.onroadplus.practica5.loginModel;

public class loginResponse {

    private int responseCode;
    private String message;
    private loginData data;

    /**
     * @param message
     * @param responseCode
     * @param data
     */
    public loginResponse(int responseCode, String message, loginData data) {
        super();
        this.responseCode = responseCode;
        this.message = message;
        this.data = data;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public loginData getData() {
        return data;
    }

    public void setData(loginData data) {
        this.data = data;
    }
}
