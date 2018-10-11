package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20171TINF0056 Artur da silva kalangomon
 */

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = dados.nextInt();
        
        if(numero >= 0){
            if(numero % 2 == 0){
            System.out.println("Numero positivo: "+numero);
            System.out.println("e par!");
            }else{
                System.out.println("Numero positivo: "+numero);
                System.out.println("e impar!");
            }
        }
        if(numero < 0){
            if(numero % 2 == 0){
                System.out.println("Numero negativo: "+numero);
                System.out.println("e par!");
            }else{
                System.out.println("Numero negativo: "+numero);
                System.out.println("e impar!");
            }
        }
        
    }
    
}
