/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.ocp.correct.config;

import com.question03.design.principles.ocp.correct.Calculator;
import com.question03.design.principles.ocp.correct.impl.CalculatorAddedImpl;
import com.question03.design.principles.ocp.correct.impl.CalculatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="calc_old")
    public Calculator getCalculator() {
        return new CalculatorImpl();
    }
    
    @Bean(name="calc_new")
    public Calculator getImprCalculator() {
        return new CalculatorAddedImpl();
    }
}
