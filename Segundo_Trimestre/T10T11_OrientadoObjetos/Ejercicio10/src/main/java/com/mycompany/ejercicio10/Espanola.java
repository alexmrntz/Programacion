/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;


public class Espanola extends Carta{
    
    private int num;
    private Especial especial;
    
    public Espanola(String p, int n, int nn, Especial e){
        
        super(p, n);
        this.num = nn;
        this.especial = e;
    }

    public int getNum() {
        return num;
    }

    public Especial getEspecial() {
        return especial;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEspecial(Especial especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return super.toString() + "Espanola{" + "num=" + num + ", especial=" + especial + '}';
    }
    
    
}
