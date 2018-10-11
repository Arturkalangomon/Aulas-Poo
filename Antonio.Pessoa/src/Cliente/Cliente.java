/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author 20171TINF0056 Artur da silva kalangomon
 */
public class Cliente {
    private int id;
    private String nome;
    private String fone;
    private double renda;
    
    public Cliente(){
    
    }
    /*
    public void setId(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRenda(double renda){
        this.renda = renda;
    }
    
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double getRenda(){
        return renda;
    }*/
    
    public void setCliente(String nome, String fone, double renda){
        this.nome = nome;
        this.fone = fone;
        this.renda = renda;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String nome(){
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
