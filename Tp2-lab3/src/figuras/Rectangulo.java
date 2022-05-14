/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import interfaz.Figuras;

/**
 *
 * @author diego
 */
public class Rectangulo implements Figuras{

    protected String nombre;
    protected int base;
    protected int lado;

    public Rectangulo(String nombre, int base, int lado) {
        this.nombre = nombre;
        this.base = base;
        this.lado = lado;
    }

    
    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public double calcularArea() {
        return this.base * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return (2*this.base)+(2*this.lado);
    }

    @Override
    public void dibujarTxt() {
        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
