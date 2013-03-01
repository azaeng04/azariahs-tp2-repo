/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.inheritance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.core.principles.inheritance.GenePool;
import za.ac.cput.azariah.core.principles.inheritance.impl.ChildImpl;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="child")
    public GenePool getChild() {
        return new ChildImpl();
    }

}
