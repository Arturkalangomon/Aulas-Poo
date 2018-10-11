/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosPOO;

/**
 *
 * @author 20171TINF0056 Artur da silva kalangomon...
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    
    public Pessoa(){
        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
}
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    public String toString(){
            return "Nome: " + nome + ", " + "sobrenome: " + sobrenome;
        }
}
