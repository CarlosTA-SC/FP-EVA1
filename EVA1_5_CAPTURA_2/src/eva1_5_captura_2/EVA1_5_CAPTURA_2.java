/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_2;
 import java.util.*;
 import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class EVA1_5_CAPTURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double salario;
        Scanner captura = new Scanner(System.in);
        System.out.println("Captura el nombre:");
        nombre=captura.nextLine();
        System.out.println("Captura la edad:");
        edad = captura.nextInt();
        System.out.println("Captura el salario:");
        salario = captura.nextDouble();
        System.out.println("Datos capturados:");
        System.out.print("Nombre:");
        System.out.println(nombre);
        System.out.print("Edad:");
        System.out.println(edad);
        System.out.print("Salario:");
        System.out.println(salario);
    }
    
}
