/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 20171TINF0056 Artur da Silva kalangomon
 *
 */
import java.util.Scanner;

public class LampadaTesteAcendeApaga {
    public static void main(String[] args){
        Scanner acao = new Scanner(System.in);
        
        Lampada lampada = new Lampada();
        
        //System.out.println("Aperte o interruptor >.-.> :v ");
        lampada.acender();
        lampada.mostrarEstado();
        lampada.apagar();
        lampada.mostrarEstado();
    }
}