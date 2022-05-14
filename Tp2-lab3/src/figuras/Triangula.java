/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author diego
 */
public abstract class Triangula {
    
    protected String nombre;
    protected int lado1;
    protected int lado2;
    protected int angulo;

    public Triangula(String nombre, int lado1, int lado2, int angulo) {
        this.nombre = nombre;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.angulo = angulo;
    }
    
    public String nombre(){
        return this.nombre;
    }
    
    public double calcularArea(){
        return (this.lado1*this.lado2)/2;
    }
    
    public double calcularPerimetro(){
        return this.lado1 + (this.lado2*2);
    }
    
    public abstract void dibujarTxt();
    
}
