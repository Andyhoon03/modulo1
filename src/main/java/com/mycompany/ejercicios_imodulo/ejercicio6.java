/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_imodulo;

import java.util.Scanner;

/**
 *
 * @author saman
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.next();
        System.out.println("Ingrese la nota");
        double nota = scanner.nextInt();
        
        if(nota>=70) {
            System.out.println(nombre + " " + nota + " " + "APROBADO");
        } else {
            System.out.println(nombre + " " + nota + " " + "REPROBADO");
        }
    }
}
