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
import java.util.Scanner;

public class WhileByAntonio {
    public static void main(String[] args){
        
        int x = 1;
        int j = 0;
        
        do{
            System.out.println(x);
            x++;
        }while (x <= 10);
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        j = dados.nextInt();
                       
    }
        System.out.println("Ultimo inserido: ",+j);
}
