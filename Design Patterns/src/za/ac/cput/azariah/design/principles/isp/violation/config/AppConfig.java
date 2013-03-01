/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.isp.violation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.design.principles.isp.violation.CalculateShape;
import za.ac.cput.azariah.design.principles.isp.violation.impl.CircleImpl;
import za.ac.cput.azariah.design.principles.isp.violation.impl.TriangleImpl;

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
