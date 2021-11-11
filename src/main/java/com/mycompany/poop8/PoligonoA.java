/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop8;

/**
 *
 * @author lenovo
 */
public abstract class PoligonoA {
                                                  //En clases abstractas podemos tener métodos abstractos y concretos
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "PoligonoA{" + '}';
    }
    
}
