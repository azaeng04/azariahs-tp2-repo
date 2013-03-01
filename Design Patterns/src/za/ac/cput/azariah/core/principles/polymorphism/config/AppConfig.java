/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.polymorphism.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.core.principles.polymorphism.CalculateShape;
import za.ac.cput.azariah.core.principles.polymorphism.impl.EqualateralTriangleImpl;
import za.ac.cput.azariah.core.principles.polymorphism.impl.SquareImpl;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="square")
    protected CalculateShape getSquare() {
        return new SquareImpl();
    }

    @Bean(name="triangle")
    protected CalculateShape getTriangle() {
        return new EqualateralTriangleImpl();
    }
}
