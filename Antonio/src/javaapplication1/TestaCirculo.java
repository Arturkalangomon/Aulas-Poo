/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/** 
 * By Artur da silva kalangomon
 * @author 20171TINF0056 Testa o calculo da area do circulo
 */
import java.util.Scanner;

public class TestaCirculo {
    double valor;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        TestaCirculo a = new TestaCirculo();
        
        System.out.println("Digite o valor do raio: ");
        valor = entrada.nextDouble();
        
        
        
        a.mostra();
    }
    
}
