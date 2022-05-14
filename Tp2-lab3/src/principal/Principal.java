/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.TrianguloRectangulo;

/**
 *
 * @author diego
 */
public class Principal {
 
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo("Rectangulo", 12, 58);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 58);
        TrianguloRectangulo triRect = new TrianguloRectangulo("Triangulo Rectangulo", 12, 12, 50);
        
        cuadrado.dibujarTxt();
        rect.dibujarTxt();
        triRect.dibujarTxt();
    }
    
    
}
