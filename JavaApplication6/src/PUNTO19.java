
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSEPH M
 */
public class PUNTO19 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado del triángulo equilatero");
        float L = entrada.nextFloat();
        double perimetro, altura, area;
        perimetro = 3 * L;
        area = Math.sqrt(3) * Math.pow(L,2)/4;
        altura = Math.sqrt(3) * L/2;
        System.out.println("El perimetro del triángulo es: "+ perimetro);
        System.out.println("La altura del triángulo es: "+ (float)altura);
        System.out.println("El area del triángulo es: "+ (float)area);
    }
}
