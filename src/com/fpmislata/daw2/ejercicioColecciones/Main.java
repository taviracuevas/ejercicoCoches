/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejercicioColecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coche coche = new Coche(Marca.SEAT, "Ibiza", 125, "48406012M");
        Coche coche2 = new Coche(Marca.FORD, "Focus", 115, "48406013M");
        Coche coche3 = new Coche(Marca.FORD, "Fiesta", 75, "12345678Z");
        Coche coche4 = new Coche(Marca.CITROEN, "C4", 90, "48458712M");
        Coche coche5 = new Coche(Marca.RENAULT, "Megan", 150, "48741012M");

        List<Coche> listaCoches = new ArrayList<Coche>();

        listaCoches.add(coche);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);
        listaCoches.add(coche5);

        //mostrar segundo elemento
        System.out.println("Segundo elemento");
        System.out.println(listaCoches.get(1).cocheCompleto());

        // Mostrar marca y modelo de todos los coches
        System.out.println("Todos  los coches");
        for (Coche c : listaCoches) {
            System.out.println("Marca: " + c.getMarca() + " Modelo:" + c.getModelo());
        }


        // Pedir por pantalla dni y mostrar su coche
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indroduce dni del propietario");
        String dni = teclado.nextLine();

        for (Coche c : listaCoches) {
            if (c.getDni().equals(dni)) {
                System.out.println(c.cocheCompleto());
            }
        }
        System.out.println("Mostrar marca ford");
        //mostrar coches de marca ford
        for (Coche c : listaCoches) {
            if (c.getMarca() == Marca.FORD) {
                System.out.println(c.cocheCompleto());
            }
        }



    }
}
