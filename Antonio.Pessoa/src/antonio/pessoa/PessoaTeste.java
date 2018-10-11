/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antonio.pessoa;

/**
 *
 * @author 20171TINF0056
 */
public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa ();
        //p1.nomePublico ="Antonio";
        //p1.nome = "Antonio";
        
        p1.setNome("Antonio"); // set - modifica
        // get - acessas o atributo
        p1.setEndereco("Rua A, Numero 1, Bairro B");
        p1.setIdade(22);
        System.out.println("Nome: "+ p1.getNome());
        System.out.println(p1.toString());
    }
    
}
