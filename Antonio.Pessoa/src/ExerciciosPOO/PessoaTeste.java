/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosPOO;

/**
 *
 * @author 20171TINF0056
 */
public class PessoaTeste {
    public static void main(String[] args){
        Pessoa teste1 = new Pessoa ();
        
        teste1.setNome("Artur");
        teste1.setSobrenome("da Silva");
        System.out.println("Nome: "+ teste1.getNome());
        System.out.println("Sobrenome: "+ teste1.getSobrenome());
        System.out.println(teste1.toString());
    }
    
}
