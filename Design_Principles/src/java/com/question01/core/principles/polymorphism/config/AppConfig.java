/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question01.core.principles.polymorphism.config;

import com.question01.core.principles.polymorphism.CalculateShape;
import com.question01.core.principles.polymorphism.impl.EqualateralTriangleImpl;
import com.question01.core.principles.polymorphism.impl.SquareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="square")
    public CalculateShape getSquare() {
        return new SquareImpl();
    }

    @Bean(name="triangle")
    public CalculateShape getTriangle() {
        return new EqualateralTriangleImpl();
    }
}
