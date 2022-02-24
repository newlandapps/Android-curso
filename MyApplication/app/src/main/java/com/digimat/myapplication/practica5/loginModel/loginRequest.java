package com.digimat.myapplication.practica5.loginModel;

public class loginRequest {

    private String user;
    private String password;

    /**
     * @param user
     * @param password
     */
    public loginRequest(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
