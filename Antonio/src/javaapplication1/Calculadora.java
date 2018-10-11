/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 20171TINF0056 Artur da Silva kalangomon by antonio >.-.> :v 
 * testando metodos...
 */
//import java.util.Scanner;


public class Calculadora {
    private double a;
    private double b;
    
    public void mudarA(double novoA){
        a = novoA;
    }
    public void mudarB(double novoB){
        b = novoB;
    }
    
    public void somar(){
        System.out.println("A soma: "+(a + b));
    }
    public void subtrair(){
        System.out.println("A subtração: "+(a - b));
    }
    public void multiplica(){
        System.out.println("A multiplicação: "+(a * b));
    }
    public void divide(){
        System.out.println("A divisão: "+(a / b));
    }
}