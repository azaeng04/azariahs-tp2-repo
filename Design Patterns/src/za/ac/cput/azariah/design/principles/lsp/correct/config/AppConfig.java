/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.lsp.correct.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.design.principles.lsp.correct.Transport;
import za.ac.cput.azariah.design.principles.lsp.correct.impl.BikeImpl;
import za.ac.cput.azariah.design.principles.lsp.correct.impl.BusImpl;
import za.ac.cput.azariah.design.principles.lsp.correct.impl.CarImpl;
import za.ac.cput.azariah.design.principles.lsp.correct.impl.UniCycleImpl;

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
