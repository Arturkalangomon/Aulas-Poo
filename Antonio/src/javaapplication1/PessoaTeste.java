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

public class PessoaTeste {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        
        Scanner dados = new Scanner(System.in); //construtor não é o padrão de pessoa(recebe um parametro)
        //Scaner dados2 = new Scanner(); // invalido, pois não recebe parametro...
         //Pessoa p1 = new Pessoa (); // construtor padrão de pessoa (default)
        Pessoa p1 = new Pessoa ();
        
        Pessoa p2 = new Pessoa("Antonio", 33, "220.467.220-18", "86933671830");
        
        p1.mostra();
        p2.mostra();
        
        Pessoa p3 = new Pessoa (p2);
        p3.mostra();
        
        Pessoa p4 = new Pessoa("Diones", 25);
        p4.mostra();
        
        
        
        String s1 = new String();
        String s2 = new String("String");
        char[] c1 = {'s', 't', 'r'};
        String s3 = new String(c1);
        
        /*p1.mudarNome("Antonio");
        p1.mudarAltura(1.58F);
        p1.mudarIdade(33);
        
        p1.dizerNome();
        p1.dizerAltura();
        p1.dizerIdade();
        
        
        Scanner dados = new Scanner(System.in);
        Pessoa p2 = Pessoa();
        System.out.println("Digite nome: ");
        String nome = dados.next();
        p2.mudarNome(nome);
        p2.dizerNome();
        */
    }   
}
