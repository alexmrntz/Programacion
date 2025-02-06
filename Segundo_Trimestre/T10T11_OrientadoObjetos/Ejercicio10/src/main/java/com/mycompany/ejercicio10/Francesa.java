/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author alexm
 */
public class Francesa extends Carta{
    
    private Color color;
    
    public Francesa(String p, int n, Color c){
        
        super(p, n);
        
        this.color = c;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Francesa{" + "color=" + color + '}';
    }
    
    
}
