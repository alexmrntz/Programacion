package com.mycompany.ejercicio1;
/*
    CLASES - OBJETOS
    
    Clase coche --> definiendo un nuevo tipo de dato
        - Matricula (String)
        - Marca
        - Modelo (String)
        - Color (String)
        - NºKm (int)

    Clases = plantilla
    Objetos = elementos creados a partir de la clase (coche1, coche2...)
    
*/

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("4444KNM","Renault","Clio","rojo",120000);
        
        Coche coche2 = new Coche("3322MNG","Renault","Clio","verde",20000);
        
        coche1.imprimirCoche(); //primero se pone lo que se quiere imprimir, punto y se llama al método
    }
    
}

        
