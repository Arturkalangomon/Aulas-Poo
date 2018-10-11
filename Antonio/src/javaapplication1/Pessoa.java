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
public class Pessoa {
    //atributos da classe Pessoa...
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    
    
    public Pessoa(String novoNome, int novaIdade, // se este esta ativo, abaixo não funciona
            String novoCpf, String novoTelefone){
        nome = novoNome;
        idade = novaIdade;
        cpf = novoCpf;
        telefone = novoTelefone;
    }
    
    public Pessoa(String nome, int idade, String cpf, String telefone){ // se este esta ativo, o de cima não funciona
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public Pessoa(String nome, int idade){ //construtor
        this.nome = nome;
        this.idade = idade;
    }
  
    public Pessoa(String nome, String cpf){ //construtor
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Pessoa(String nome, String telefone){ //construtor invalido Tipo: String e String... pois já existe um tipo definido
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Pessoa(Pessoa p){ //construtor
        this(p.nome, p.idade, p.cpf, p.telefone);//somente valido na primeira linha do construtor...
    }
    
    public Pessoa(String nome, String cpf, String telefone){ //construtor...
        //this(nome, 0, cpf, telefone); se usar o abaixo, essa linha se torna invalida...
        this(nome, telefone);
        this.cpf = cpf;
    }
    
    public void mostra(){ //metodo
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }
}

/* o que define o construtor, é os tipos definidos...  */

//referencias... -> 
// null/ nada... nulo...
// this/ 


//sobrecarga de metodo, ou construtor... mais de um metodo ou construtor por classe...

//difere os construtores pelos tipos definidos... não pode haver titpos definidos iguais...