package javaapplication1;

/**
 *
 * @author 20171TINF0056 Artur da silva kalangomon
 */
public class Lampada {
    private String estado;
    
    public void acender(){
        estado ="aceso";
    }
    public void apagar(){
        estado ="apagado";
    }
    
    public void mostrarEstado(){
        System.out.println("A lampada esta: " +estado);
    }
}
