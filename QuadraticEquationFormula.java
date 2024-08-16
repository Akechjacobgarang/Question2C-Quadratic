/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadraticequationformula;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class QuadraticEquationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Formula");
        System.out.println("Enter the coefficients for ax^2 + bx + c:");

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // Real and equal roots
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1 (Complex): " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 (Complex): " + realPart + " - " + imaginaryPart + "i");
        }

        
    }
}

