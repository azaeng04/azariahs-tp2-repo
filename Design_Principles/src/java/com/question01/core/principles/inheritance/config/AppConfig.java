/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question01.core.principles.inheritance.config;

import com.question01.core.principles.inheritance.GenePool;
import com.question01.core.principles.inheritance.impl.ChildImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
