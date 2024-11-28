/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecuacion_segundo_grado;

/**
 *
 * @author camil
 */
import java.util.Scanner;

public class Ecuacion_segundo_grado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, discriminante = 0;
        boolean numerosValidos = false;

        while (!numerosValidos) {
            try {
                System.out.print("Ingrese a: ");
                a = teclado.nextDouble();
                System.out.print("Ingrese b: ");
                b = teclado.nextDouble();
                System.out.print("Ingrese c: ");
                c = teclado.nextDouble();
                numerosValidos = true;
            } catch (Exception e) {
                System.out.println("Error debe ingresar un número válido!!");
                teclado.next();
            }
        }        

        discriminante = Math.pow(b, 2) - (4 * a * c);

        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("Tiene infinitas soluciones.");
        }
        else if (discriminante > 0) {
            x1 = ((-b + Math.sqrt(discriminante)) / (2 * a));
            x2 = ((-b - Math.sqrt(discriminante)) / (2 * a));
            System.out.print("La solución es x1 es " + x1 + " la solución es x2 es " + x2);
        }
        else if (discriminante < 0) {
            System.out.print("Tiene soluciones no reales.");
        }
        else if (discriminante == 0) {
            try {
                x1 = ((-b + Math.sqrt(discriminante)) / (2 *a));
            } catch (Exception e) {
                x1 = ((-b - Math.sqrt(discriminante))/ (2 *a));
            }
            System.out.print("La solución es " + x1);
        }
        else{
            System.out.print("Ocurrio un error...");
        }
    }
}
