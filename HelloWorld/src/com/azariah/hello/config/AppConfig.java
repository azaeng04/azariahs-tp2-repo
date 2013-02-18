/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azariah.hello.config;

import com.azariah.hello.GasHelloWorld;
import com.azariah.hello.NuclearHelloWorld;
import com.azariah.hello.impl.GasHelloWorldImpl;
import com.azariah.hello.impl.NuclearHelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Azariahs
 */
@Configuration
public class AppConfig {
    @Bean(name="hello")
    public NuclearHelloWorld getNuclear(){
        return new NuclearHelloWorldImpl();
    }
    
    @Bean
    public GasHelloWorld getGas(){
        return new GasHelloWorldImpl();
    }
}
