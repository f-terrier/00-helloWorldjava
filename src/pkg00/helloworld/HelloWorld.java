/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;

/**
 *
 * @author fterrier
 */
import java.util.Scanner;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        Scanner sy = new Scanner(System.in);
        float a, b;
        System.out.print("Saisir a : ");
        a = sx.nextFloat();
        System.out.print("Saisir b : ");
        b = sy.nextFloat();
        
        float res = ( a + b ) * 2;

        System.out.println("Resultat : " + res);
    }
    
}
