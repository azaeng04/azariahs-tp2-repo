/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author boniface
 */
@Controller
public class LoginController {

    @RequestMapping({"/login"})
    public String login(Model model) {
        return "login/login";
    }
    
    @RequestMapping({"/loginfailed"})
    public String loginFailed(Model model) {
        model.addAttribute("error", "true");
        return "login/login";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout(Model model) {
        return "redirect:login/login";
    }
}
