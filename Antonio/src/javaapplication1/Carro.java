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

public class Carro { //classe carro
    String nome, modelo, marca, motor; //atributos ou metodos da classe
    int potencia; //vide comentario anterior
    public static void main(String[] args){ //função principal do programa
        Scanner dados = new Scanner(System.in); //metodo de entrada...
        Carro carro; // criação do objeto
            carro = new Carro();
        
        System.out.println("Digite uma marca de carro: ");
        carro.nome = dados.nextLine();
        dados.nextLine();
        System.out.println("Digite o modelo do veiculo: ");
        carro.modelo = dados.nextLine();
        dados.nextLine();
        System.out.println("Digite o tipo de motor que equipa o veiculo: ");
        carro.motor = dados.nextLine();
        dados.nextLine();
        System.out.println("Digite a potencia: ");
        carro.potencia = dados.nextInt();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Caracteristicas do Veiculo: ");
        System.out.println(carro.marca);
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.motor+"cv "+carro.potencia);
        System.out.println("-------------------------------------------------");
        
    }
}
