/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSEPH M
 */

    public class rectangulo {
    int base; 
    int altura; 
    rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    double calcularArea() {
    return base * altura;
    }
    double calcularPerímetro() {
    return (2 * base) + (2 * altura);
    }
}
