/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question01.core.principles.encapsulation.config;

import com.question01.core.principles.encapsulation.User;
import com.question01.core.principles.encapsulation.impl.UserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="user")
    public User getUser() {
        return new UserImpl();
    }
}
