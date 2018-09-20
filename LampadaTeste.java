package javaapplication1;

/**
 *
 * @author 20171TINF0056 Artur da Silva kalangomon
 *
 */
import java.util.Scanner;

public class LampadaTesteAcendeApaga {
    public static void main(String[] args){
        Scanner acao = new Scanner(System.in);
        
        Lampada lampada = new Lampada();
        
        //System.out.println("Aperte o interruptor >.-.> :v ");
        lampada.acender();
        lampada.mostrarEstado();
        lampada.apagar();
        lampada.mostrarEstado();
    }
}
