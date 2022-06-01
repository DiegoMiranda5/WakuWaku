/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;

import Excepciones.NoCaracterExcepcion;
import Excepciones.NumberNegativeExcepcion;
import java.util.Scanner;
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

    public void ingresarNumero() throws NoCaracterExcepcion, NumberNegativeExcepcion {

        Scanner teclado = new Scanner(System.in);
        String numeroAuxiliar;

        do {
            System.out.print("Ingrese un numero (0 para salir): ");
            numeroAuxiliar = teclado.nextLine();

            Pattern p = Pattern.compile("\\D");
            Matcher m = p.matcher(numeroAuxiliar);
            if (m.find()) {
                throw new NoCaracterExcepcion();
            }else{
                numero = Integer.parseInt(numeroAuxiliar);
                if(numero < 0){
                    throw new NumberNegativeExcepcion();
                }
            }

        } while (numero != 0);

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    

}
