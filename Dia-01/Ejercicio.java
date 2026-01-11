/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg01.ejercicio;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Dia01Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ejercicio realizado por Dylan!");
        
        System.out.println("Programa que pida por teclado al usuario su NOMBRE,"
                + "EDAD Y ALTURA EN METROS");
        
        
        System.out.println("Teclea tu NOMBRE: ");
        String nombre = leer.nextLine();
        
        System.out.println("Teclea tu EDAD: ");
        int edad = leer.nextInt();
        
        System.out.println("Teclea si mides UN METRO O DOS METROS (NUMERO): ");
        int metro = leer.nextInt();
        
        System.out.println("Teclea los CENTIMETROS que mides: ");
        int centimetros = leer.nextInt();
        
           System.out.println("El usuario " + nombre + " tiene " + edad + " años de edad y mide " + metro + "." +
                centimetros + " centimetros");
        
        System.out.println("El usuario " + nombre + " tiene " + edad + " años de edad y mide " + metro + " metros" + " y " +
                centimetros + " centimetros");
             
    }
    
}
