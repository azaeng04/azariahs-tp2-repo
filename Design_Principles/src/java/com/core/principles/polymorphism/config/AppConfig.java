/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.principles.polymorphism.config;

import com.core.principles.polymorphism.impl.EqualateralTriangleImpl;
import com.core.principles.polymorphism.impl.SquareImpl;
import com.design.principles.isp.violation.CalculateShape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
