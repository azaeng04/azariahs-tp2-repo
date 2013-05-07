/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author boniface
 */
@Controller
public class HomeController {

    @RequestMapping({"/"})
    public String home(Model model) {
        return "index";
    }
}
