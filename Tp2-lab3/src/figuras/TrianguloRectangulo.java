/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author diego
 */
public class TrianguloRectangulo extends Triangula{

    public TrianguloRectangulo(String nombre, int lado1, int lado2, int angulo) {
        super(nombre, lado1, lado2, angulo);
    }
    
    
    
    @Override
    public void dibujarTxt() {
        for (int i = 0; i < this.lado2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
