/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3atc2;

import Excepciones.NoCaracterExcepcion;
import Excepciones.NumberNegativeExcepcion;
import java.util.logging.Level;
import java.util.logging.Logger;
import numero.Numero;

/**
 *
 * @author diego
 */
public class Tp3Atc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero num = new Numero();;
        do {
            try {
                num.ingresarNumero();
                System.out.println("Hola");
            } catch (NoCaracterExcepcion ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (NumberNegativeExcepcion ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } while (num.getNumero() != 0);

    }

}
