package oop;

import oop.annotation.NotBlank;

public class LoginRequest {
    @NotBlank
    public String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank
    public String password;

    LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
