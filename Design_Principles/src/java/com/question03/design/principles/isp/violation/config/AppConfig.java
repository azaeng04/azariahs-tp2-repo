/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.isp.violation.config;

import com.question03.design.principles.isp.violation.CalculateShape;
import com.question03.design.principles.isp.violation.impl.CircleImpl;
import com.question03.design.principles.isp.violation.impl.TriangleImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="circle")
    public CalculateShape getCircle() {
        return new CircleImpl();
    }

    @Bean(name="triangle")
    public CalculateShape getTriangle() {
        return new TriangleImpl();
    }
}
