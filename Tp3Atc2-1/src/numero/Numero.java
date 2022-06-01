/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;

import Excepciones.NoCaracterExcepcion;
import Excepciones.NumberNegativeExcepcion;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diego
 */
public class Numero {

    private int numero;

    public Numero() {
        numero = 1;
    }

    public void ingresarNumero(){
        
        Scanner teclado = new Scanner(System.in);
        String numeroAux;
        do{
            try {
                System.out.print("Ingrese un numero (0 para salir): ");
                numeroAux = teclado.nextLine();
                numero = this.isNumero(numeroAux);
                if(numero < 0){
                    throw new NumberNegativeExcepcion();
                }
            } catch (NoCaracterExcepcion ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }catch(NumberNegativeExcepcion ex){
                System.out.println("ERROR: " + ex.getMessage());
            }
            
        }while(numero != 0);
        
    }
    
    public int isNumero(String numero) throws NoCaracterExcepcion{
        try{
            Integer.parseInt(numero);
        }catch(NumberFormatException ex){
            throw new NoCaracterExcepcion();
        }
        return Integer.parseInt(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
