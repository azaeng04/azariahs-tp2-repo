/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.srp.correct.config;

import com.question03.design.principles.srp.correct.CalculateArea;
import com.question03.design.principles.srp.correct.CalculatePerimeter;
import com.question03.design.principles.srp.correct.impl.CalculateSquareArea;
import com.question03.design.principles.srp.correct.impl.CalculateSquarePerimeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="calc_square_area")
    public CalculateArea getSquareAreaCalculator() {
        return new CalculateSquareArea();
    }
    
    @Bean(name="calc_square_perimeter")
    public CalculatePerimeter getSquarePerimeterCalculator() {
        return new CalculateSquarePerimeter();
    }
}
