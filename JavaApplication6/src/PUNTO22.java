
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSEPH M
 */
public class PUNTO22 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioxhora = entrada.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horas = entrada.nextInt();

        double salario = salarioxhora * horas;

        if (salario > 450000) {
            System.out.println("El salario mensual de " + nombre + " es de: $" + salario);
        } else {
            System.out.println(nombre);
        }
    }
}
