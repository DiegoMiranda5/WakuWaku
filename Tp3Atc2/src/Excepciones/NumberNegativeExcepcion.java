/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author diego
 */
public class NumberNegativeExcepcion extends Exception {

    public NumberNegativeExcepcion() {
        super("No se permiten numero negativos");
    }

    public NumberNegativeExcepcion(String message) {
        super(message);
    }
    
    
    
}
