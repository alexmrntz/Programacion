/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;


public class Carta {
    
    private String palo;
    private int numero;
    
    public Carta(String p, int n){
        
        this.palo = p;
        this.numero = n;
        
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }
    
    public void mostrarCarta(){
        
        System.out.println(this.palo + this.numero);
        
    }
    
}
