/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_ecuacion;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA1_14_ECUACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el valor a: ");
        a = captu.nextDouble();
        System.out.println("Captura el valor b: ");
        b = captu.nextDouble();
        System.out.println("Captura el valor c: ");
        c = captu.nextDouble();
        x1 = (-1 * b + Math.sqrt((b*b) - (4 * a * c))) / 2 * a;
        x2 = (-1 * b - Math.sqrt((b*b) - (4 * a * c))) / 2 * a;
        System.out.println("Raiz1 = " + x1);
        System.out.println("Raiz2 = " + x2);
    }
    
}
