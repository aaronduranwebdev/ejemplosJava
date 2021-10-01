/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjeturacollatz;
import java.util.Scanner;
/**
 *
 * @author aaronduranwebdev
 */
public class ConjeturaCollatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número positivo:");
        int x = teclado.nextInt();
        do {
            if ( x % 2 == 0 ) {
                x = x / 2; 
            } else if ( x % 2 == 1) {
                x = x * 3 + 1;
            }
            System.out.println(x);
        } while ( x != 1 );
    }
}