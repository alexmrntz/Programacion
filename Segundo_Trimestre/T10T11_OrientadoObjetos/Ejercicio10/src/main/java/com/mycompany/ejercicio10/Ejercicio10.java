/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio10;

/**
 * Un juego de cartas online permite utilizar cartas tanto de la baraja española
 * como de la baraja francesa. Desarrolla un sistema que permita crear cartas de
 * diferentes juegos. Todas las cartas tienen palo y número. Todas las cartas
 * deben obligatoriamente tener un método mostrarCarta() que muestre el palo y
 * el número. Las cartas españolas tienen también un atributo que permite
 * guardar si son una carta numérica (1-7) o especial (sota, caballo, rey). Las
 * cartas francesas tienen también un atributo que permite guardar el color
 * (rojo o negro). En el main, crea una interfaz por consola que pregunte al
 * usuario cuántas cartas va a utilizar para el juego. Después, preguntará una a
 * una que tipo de carta desea crear y, en función del tipo preguntará también
 * los datos correspondientes. Al terminar de introducir todas las cartas, se
 * mostrará por consola el listado de cartas creadas, en el mismo orden que
 * fueron creadas.
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        
        
        int numCartas = Integer.parseInt(System.console().readLine("número de cartas que se van a crear"));
        
        
        String[] cartasCreadas = new String[numCartas];
        
        for (int i = 0; i < cartasCreadas.length; i++) {
            String cartasCreada = cartasCreadas[i];
            
        }
        
    }
}
