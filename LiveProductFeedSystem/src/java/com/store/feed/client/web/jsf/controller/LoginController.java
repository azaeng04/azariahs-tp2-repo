/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsf.controller;

import com.store.feed.service.impl.UserServicesImpl;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author 210192461
 */
@ManagedBean
@SessionScoped
public class LoginController implements Serializable {

    private UserServicesImpl userServices;
    private String username;
    private String password;

    public LoginController() {
        userServices = UserServicesImpl.getInstance();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkLoginDetails(ActionEvent actionEvent) {
        try {
            if (username.equals("admin") && password.equals("admin")) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Access Granted", "Your login details are correct."));
            } else if (userServices.checkIfUserExists(username, password)) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Access Granted", "Your login details are correct."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Access denied", "Username and password required"));
            }
        } catch (NullPointerException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Access denied", "Username or password incorrect"));
        }
    }
}
