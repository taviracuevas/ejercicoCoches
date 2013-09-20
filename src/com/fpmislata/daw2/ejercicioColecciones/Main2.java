/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejercicioColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main2 {

    public static void main(String[] args) {

        Coche coche = new Coche(Marca.SEAT, "Ibiza", 125, "48406012M");
        Coche coche2 = new Coche(Marca.FORD, "Focus", 115, "48406013M");
        Coche coche3 = new Coche(Marca.FORD, "Fiesta", 75, "12345678Z");
        Coche coche4 = new Coche(Marca.CITROEN, "C4", 90, "48458712M");
        Coche coche5 = new Coche(Marca.RENAULT, "Megan", 150, "48741012M");

        Map<String, Coche> mapCoches = new HashMap<String, Coche>();

        mapCoches.put(coche.getDni(), coche);
        mapCoches.put(coche2.getDni(), coche2);
        mapCoches.put(coche3.getDni(), coche3);
        mapCoches.put(coche4.getDni(), coche4);
        mapCoches.put(coche5.getDni(), coche5);

        //mostrar coche con dni 12345678Z
        System.out.println("Coche con dni 12345678Z");
        System.out.println(mapCoches.get("12345678Z").cocheCompleto());

        //mostrar todos los coches y su dni
        System.out.println("Mostrar todos los coches");
        for (String dni : mapCoches.keySet()) {

            System.out.println(dni + " " + mapCoches.get(dni).cocheCompleto());
        }


        //introduce dni y muestra coche
        System.out.println("Indroduce dni del propietario");
        Scanner teclado = new Scanner(System.in);
        String dniBuscar = teclado.nextLine();

        System.out.println(mapCoches.get(dniBuscar).cocheCompleto());

        //muestra los coches con marca ford
        System.out.println("Coches ford");
        for (String dniBuscar2 : mapCoches.keySet()) {
            if (mapCoches.get(dniBuscar2).getMarca() == Marca.FORD) {
                System.out.println(dniBuscar2 + " " + mapCoches.get(dniBuscar2).cocheCompleto());
            }
        }



    }
}
