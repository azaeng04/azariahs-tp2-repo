/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.ocp.violation.config;

import com.question03.design.principles.ocp.violation.impl.CalculatorAddedImpl;
import com.question03.design.principles.ocp.violation.impl.CalculatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="calc_old")
    public CalculatorImpl getCalculator() {
        return new CalculatorImpl();
    }
    
    @Bean(name="calc_new")
    public CalculatorAddedImpl getImprovedCalculator() {
        return new CalculatorAddedImpl();
    }
}
