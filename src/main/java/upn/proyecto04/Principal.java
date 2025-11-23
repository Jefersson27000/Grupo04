/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upn.proyecto04;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
          try {
            System.out.println("Edad en meses: " + persona.calcularEdad(20));
        } catch (Exception e) {
            System.out.println("Error calculando edad: " + e.getMessage());
        }

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona());
        System.out.println("Cantidad de personas en la colección: " + lista.size());
    }
        
    }

