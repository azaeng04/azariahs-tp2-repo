/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.principles.inheritance.impl;

import com.core.principles.inheritance.GenePool;

/**
 *
 * @author Ronald
 */
public class ChildImpl implements GenePool{
    @Override
    public String greenEyes(){
        return "Green eyes";
    }
    
    @Override
    public String tallGene(){
        return "Tall gene";
    }

    @Override
    public String shortGene() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String blueEyes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
