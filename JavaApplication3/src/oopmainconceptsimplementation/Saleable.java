/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmainconceptsimplementation;

/**
 *
 * @author servi
 */
public interface Saleable {
    /**
     * @const REC_SALE_PRICE is recommended price to sell
     */
    public static final boolean SALEABLE = true;
    /**
     * method returns the value of item that implements the saleable interface.
     * Class that implements the interface should implement this method.
     * @return method returns price for sale
     */
    public int getSalePrice();   
}
