/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ronalds
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public ModelAndView helloWorld() {
        String message = "Hello World!";
        return new ModelAndView("hello", "message", message);
    }
}
