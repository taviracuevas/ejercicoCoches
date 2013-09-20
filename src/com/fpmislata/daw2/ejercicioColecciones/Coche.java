/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejercicioColecciones;

/**
 *
 * @author alumno
 */
public class Coche {
    private Marca marca;
    private String modelo;
    private int cilindrada;
    private String dni;
    
    public Coche(){
        
    }

    public Coche(Marca marca, String modelo, int cilindrada, String dni) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.dni = dni;
    }
    
   

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String cocheCompleto(){
        return "Marca: " + marca + "  Modelo: " + modelo + "  Cilindrada: " + cilindrada 
                + "  Dni propietario: " + dni;
    }
    
}
