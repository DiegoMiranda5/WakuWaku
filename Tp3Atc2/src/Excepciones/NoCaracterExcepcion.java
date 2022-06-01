/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author diego
 */
public class NoCaracterExcepcion extends Exception {

    public NoCaracterExcepcion() {
        super("No se permiten caracteres");
    }

    public NoCaracterExcepcion(String message) {
        super(message);
    }
    
}
