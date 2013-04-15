/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.srp.violation.config;

import com.question03.design.principles.srp.violation.CalculateShape;
import com.question03.design.principles.srp.violation.impl.CalculateSquare;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="calc_square")
    public CalculateShape getCalculator() {
        return new CalculateSquare();
    }
}
