/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.isp.correct.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.design.principles.isp.correct.CalculateShape;
import za.ac.cput.azariah.design.principles.isp.correct.impl.CircleImpl;
import za.ac.cput.azariah.design.principles.isp.correct.impl.TriangleImpl;

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
