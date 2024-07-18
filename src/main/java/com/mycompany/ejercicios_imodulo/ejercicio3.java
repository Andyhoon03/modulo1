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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = 6, T=1, K=-10;
        boolean i;
        
        if(M>T) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        if((T/K)==-5) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        if((M+T==7)||(M-T==5)) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
}
