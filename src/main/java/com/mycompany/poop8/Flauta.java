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
public class Flauta extends InstrumentoViento{

    public Flauta() {
    }
    //Podemos sobreescribir los metodos
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}
