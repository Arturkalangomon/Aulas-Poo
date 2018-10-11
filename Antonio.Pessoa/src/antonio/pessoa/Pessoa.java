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
public class Pessoa {
	private String nome;	
	private String endereco;
	private int idade;
	
	public Pessoa(){
	
	}
	
	public void setNome(String nome){ // o metodo set modifica os atribudos...
		this.nome = nome;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
        
        public String getNome(){ // metodo get retorna o atributo...
            return nome;
        }
        
        public String getEndereco(){
            return endereco;
        }
        
        public int getIdade(){
            return idade;
        }
        
        public String toString(){
            return "Nome: " + nome + ", " + "endereço: "+ endereco +", "+ idade;
        }
}