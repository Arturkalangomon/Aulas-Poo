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
public class ClienteTeste {
    public static void main(String[] args){
        Cliente c1 = new Cliente(1, "Antonio", "9999-6666", 1000.00);
        System.out.println(c1);
        
        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Fabiano");
        c2.setFone("3333 4444");
        c2.setRenda(500.00);
        System.out.println(c2);
    }
}
