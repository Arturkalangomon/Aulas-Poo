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
public class ParImpar {
    
    public static void main(String[] args){
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                int res = 0;
                res = i;
                System.out.println("eh par! "+i);
            }if(i % 2 != 0){
                int res = 0;
                res = i;
                System.out.println("eh impar! "+i);
            }
        }
            
    }
}

