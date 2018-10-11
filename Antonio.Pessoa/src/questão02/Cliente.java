/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão02;

/**
 *
 * @author 20171TINF0056
 */
public class Cliente {
    private int id;
    private String nome;
    private String fone;
    private double renda;
    
    public Cliente(){
        
    }
    public void Cliente(int id, String nome, String fone, double renda){
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.renda = renda;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setFone(String fone){
        this.fone = fone;
    }
    public String getFone(){
        return fone;
    }
    
    public void setRenda(double renda){
        this.renda = renda;
    }
    public double getRenda(){
        return renda;
    }
}
