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


public class AnoBissexto {
    
    public static void main(String[] args){
        
        Scanner dados = new Scanner(System.in);
        int ano;
        System.out.println("Digite o ano: ");
        ano = dados.nextInt();
        
        if(ano % 4 == 0){
            System.out.println("O ano é bissexto: "+ano);
        }
        if((ano % 100 != 0) && (ano % 400 == 0)){
            System.out.println("O ano é bissexto: "+ano);
            if((ano % 100 == 0) && (ano % 400 != 0)){
                System.out.println("O ano "+ano+" não é bissexto!");
            }
        }
        
    }
}