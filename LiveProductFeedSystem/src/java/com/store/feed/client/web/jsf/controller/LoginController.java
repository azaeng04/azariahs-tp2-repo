/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsf.controller;

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
public class LoginController {

    public LoginController() {
    }

    public void checkLoginDetails(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful", "Hello Primefaces"));
        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }
}
