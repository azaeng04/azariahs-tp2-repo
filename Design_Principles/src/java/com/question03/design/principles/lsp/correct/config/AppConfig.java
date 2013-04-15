/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.lsp.correct.config;

import com.question03.design.principles.lsp.correct.Transport;
import com.question03.design.principles.lsp.correct.impl.BikeImpl;
import com.question03.design.principles.lsp.correct.impl.BusImpl;
import com.question03.design.principles.lsp.correct.impl.CarImpl;
import com.question03.design.principles.lsp.correct.impl.UniCycleImpl;
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
