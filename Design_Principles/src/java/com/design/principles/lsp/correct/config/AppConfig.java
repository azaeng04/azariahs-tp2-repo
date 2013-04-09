/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.principles.lsp.correct.config;

import com.design.principles.lsp.violation.Transport;
import com.design.principles.lsp.violation.impl.BikeImpl;
import com.design.principles.lsp.violation.impl.BusImpl;
import com.design.principles.lsp.violation.impl.CarImpl;
import com.design.principles.lsp.violation.impl.UniCycleImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="car")
    public Transport getCar() {
        return new CarImpl();
    }

    @Bean(name="unicycle")
    public Transport getUniCycle() {
        return new UniCycleImpl();
    }
    
    @Bean(name="bike")
    public Transport getBike() {
        return new BikeImpl();
    }
    
    @Bean(name="bus")
    public Transport getBus() {
        return new BusImpl();
    }
}
