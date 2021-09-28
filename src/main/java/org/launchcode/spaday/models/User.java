package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message="Username is required.")
    @Size(min=5, max=15, message="The username must be between 3 and 15 characters.")
    private String username;

    @Email(message = "The email address must be in correct format.")
    private String email;

    @NotBlank(message="Password is required.")
    @Size(min=6, message = "Password must be 6 or more characters.")
    private String password;

    @NotBlank(message="Password is required.")
    @Size(min=6, message = "Password must be 6 or more characters.")
    private String verify;

    @NotNull(message="Passwords do not match.")
    private String verifyPassword;


    public User() {
    }

    public User(String username, String email, String password, String verify, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
        this.verifyPassword = verifyPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    private void checkPassword() {
        if ((this.password != null) && (this.verifyPassword != null) && (!this.password.equals(this.verifyPassword))) {
            this.verifyPassword = null;
        }
    }


}
