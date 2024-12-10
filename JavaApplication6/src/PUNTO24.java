
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSEPH M
 */
public class PUNTO24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso esfera A: ");
        double A = sc.nextInt();
        System.out.print("Peso esfera B: ");
        double B = sc.nextInt();
        System.out.print("Peso esfera C: ");
        double C = sc.nextInt();
        

        if (A > B & A > C) {
            System.out.println("La esfera con peso " + A + " es la de mayor peso");
        } else if (B > C) {
            System.out.println("La esfera con peso " + B + " es la de mayor peso");
        } else {
            System.out.println("La esfera con peso " + C + " es la de mayor peso");
        }
    }
}
