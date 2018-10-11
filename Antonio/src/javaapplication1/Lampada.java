/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 20171TINF0056 Artur da silva kalangomon
 */
public class Lampada {
    private String estado;
    
    public void acender(){
        estado ="aceso";
    }
    public void apagar(){
        estado ="apagado";
    }
    
    public void mostrarEstado(){
        System.out.println("A lampada esta: " +estado);
    }
}