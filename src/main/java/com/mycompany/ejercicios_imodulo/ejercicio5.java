/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_imodulo;

/**
 *
 * @author saman
 */
public class ejercicio5 {
    public static void main(String[] args) {
        String[] nombre={"DAMIAN", "KARLA", "RAMON", "JOSE", "AXEL"};
        String[] apellido={"FUNEZ", "MARTINEZ", "FLORES", "MEZA", "HENRIQUEZ"};
        String[] carrera={"INDUSTRIAL", "COMPUTACION", "ELECTRONICA", "INDUSTRIAL", "COMPUTACION"};
        String[] lugarTrabajo={"ESTUDIANTE", "ENEE", "TECHNOS", "TEVISAT", "CABLE COLOR"};
        
        System.out.println("NOMBRE      APELLIDO        CARRERA          LUGAR DE TRABAJO");
        for(int i=0;i<5;i++){
            System.out.println(nombre[i] + "         " + apellido[i] + "        " + carrera[i] + "        " + lugarTrabajo[i]);
        }
    }
}