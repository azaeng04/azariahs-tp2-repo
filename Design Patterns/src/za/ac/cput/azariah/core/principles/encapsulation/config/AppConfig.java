/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.encapsulation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.core.principles.encapsulation.User;
import za.ac.cput.azariah.core.principles.encapsulation.impl.UserImpl;

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
