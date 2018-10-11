/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 20171TINF0056
 */
public class CalculaCirculo {
    double valor;
    double area;
    double raio;
    double pi = 3.14;
    
    public void Calcula(){
        area = pi * (valor * valor);
    }
    public void mostra(){
        System.out.println("Area do circulo: "+area);
    }
}