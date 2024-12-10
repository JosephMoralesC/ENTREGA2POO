
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSEPH M
 */
public class PUNTO10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de inscripción: ");
        int Inscripcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer del Scanner
        System.out.print("Ingrese el nombre completo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese patrimonio: ");
        double patrimonio = sc.nextDouble();
        System.out.print("Ingrese el estrato social: ");
        int estrato = sc.nextInt();

        double pagoMatricula = 50000;

        if (patrimonio > 2000000 & estrato > 3) {
            double incremento = patrimonio * 0.03;
            pagoMatricula += incremento;
        }

        System.out.println("El estudiante con número de inscripción "+ Inscripcion + " y nombre "+nombre +" debe pagar $" + pagoMatricula);
    }
    
}
