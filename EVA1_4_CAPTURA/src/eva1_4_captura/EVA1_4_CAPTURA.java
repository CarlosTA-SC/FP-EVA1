/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner capturar= new Scanner(System.in);
        
        System.out.println("Captura el nombre:");
        nombre = capturar.nextLine();
        System.out.println("El valor capturado es ");
        System.out.println(nombre);
    }
    
}
