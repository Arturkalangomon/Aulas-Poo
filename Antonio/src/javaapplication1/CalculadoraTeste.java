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
import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        Calculadora c1 = new Calculadora();
        c1.mudarA(10);
        c1.mudarB(20);
        c1.somar();
        
        Calculadora c2 = new Calculadora();
        System.out.println("Digite o 1º: ");
        c2.mudarA(dados.nextDouble());
        System.out.println("Digite o 2º: ");
        c2.mudarB(dados.nextDouble());
        c2.somar();
        c2.subtrair();
        c2.multiplica();
        c2.divide();
    }
}