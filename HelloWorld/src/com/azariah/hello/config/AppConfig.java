/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azariah.hello.config;

import com.azariah.hello.HelloWorld;
import com.azariah.hello.impl.GasHelloWorldImpl;
import com.azariah.hello.impl.NuclearHelloWorldImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Azariahs
 */
@Configurable
public class AppConfig {
    @Bean(name="hello")
    public HelloWorld getNuclear(){
        return new NuclearHelloWorldImpl();
    }
    
    @Bean
    public HelloWorld getGas(){
        return new GasHelloWorldImpl();
    }
}
