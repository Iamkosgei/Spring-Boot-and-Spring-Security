package com.iamkosgei.Spring.Boot.JPA.JWT.models;


import javax.persistence.*;
@Entity
@Table(name="MYUSER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String email;
    private String password;
    private boolean active;
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
